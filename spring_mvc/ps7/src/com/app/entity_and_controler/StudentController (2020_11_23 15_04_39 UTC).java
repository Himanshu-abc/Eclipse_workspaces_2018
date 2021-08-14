package com.app.entity_and_controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView function() {
		
		Student st=new Student();
		ModelAndView mav=new ModelAndView("form","st",st);
		
		String[] hobbies=new String[] {"reading","listening","sports","dance","other"};
		mav.addObject("hb",hobbies);
		
		List<String> qf=new ArrayList<String>();
		
		qf.add("BE");
		qf.add("ME");
		qf.add("BCA");
		qf.add("MCA");
		mav.addObject("quals",qf);
		
		List<City> city=new ArrayList<>();
		
		city.add(new City("indore" , "INDB"));
		city.add(new City("bhopal" , "BPL"));
		city.add(new City("jabalpur" , "JBL"));
		city.add(new City("dewas" , "DW"));
		city.add(new City("ujjain" , "UJJ"));
		city.add(new City("other" , "OTHER"));
		
		mav.addObject("city" , city);
		
		return mav;
	}
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public ModelAndView function2(@ModelAttribute(value="st")Student st,BindingResult form) {
			
			 ModelAndView mav=new ModelAndView("display");
			 return mav;
	}
}