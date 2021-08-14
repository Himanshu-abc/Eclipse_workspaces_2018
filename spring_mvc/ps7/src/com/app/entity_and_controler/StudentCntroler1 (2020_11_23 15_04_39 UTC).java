package com.app.entity_and_controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentCntroler1 {
	
	@RequestMapping(value="/form1" , method=RequestMethod.GET)
	public ModelAndView function() {
		
		Student st=new Student();
		ModelAndView mav=new ModelAndView("form1","st",st);
		return mav;
	}
	
	@ModelAttribute(value="hb")
	public String[] function1() {
		
		String[] hb=new String[] {"cricket","football","hockey","other","chess"};
		return hb;
	}
	
	@ModelAttribute(value="quals")
	public List<String> function2() {
		List<String> quals=new ArrayList<>();
		
		quals.add("BE");
		quals.add("ME");
		quals.add("BCA");
		quals.add("MCA");
		return quals;
	}
	
	@ModelAttribute(value="city")
	public List<City> function3() {
		
     List<City> city=new ArrayList<>();
		
		city.add(new City("indore" , "INDB"));
		city.add(new City("bhopal" , "BPL"));
		city.add(new City("jabalpur" , "JBL"));
		city.add(new City("dewas" , "DW"));
		city.add(new City("ujjain" , "UJJ"));
		city.add(new City("other" , "OTHER"));
		
		return city;
	}
	@RequestMapping(value="/save1",method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="st")Student st) {
		
		 ModelAndView mav=new ModelAndView("display");
		 return mav;
}
}