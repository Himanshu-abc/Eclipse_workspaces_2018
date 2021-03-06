package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeControler {

	@RequestMapping(value="/form" , method=RequestMethod.GET)
	public ModelAndView function1() {
		
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("form","emp",emp);
		
		String[] hobbies=new String[] {"cricket","football","hockey","chess","tennis"
				,"other outdoor games","other indoor games"};
		
		mav.addObject("hbs",hobbies);
		
		List<String> dept=new ArrayList<String>();
		dept.add("accounts");
		dept.add("technical");
		dept.add("infrastructure");
		dept.add("help");
		dept.add("security");
		
		mav.addObject("dept" , dept);
		
		return mav;
	}
	
	@RequestMapping(value="/saveDetail" , method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute("emp") Employee emp , BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView mav=new ModelAndView("form");
			return mav;
		}
		
		ModelAndView mav=new ModelAndView("display");
		return mav;
	}
	/*@ResponseBody
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> function3() {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("raju", 22, "Male", new String[] {"cricket"}, "it", 600000d));
		list.add(new Employee("sheetal",32,"Female",new String[] {"football,hockey"},"infrstructure",3242432d));
		list.add(new Employee("mohan", 44,"Male",new String[] {"carrom","ludo"},"help",3434343d));
		return list;
	}*/
}