package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.Address;
import com.app.entity.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView function() {
		
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("form","emp",emp);
		mav.addObject("message","this is students form");
		return mav;
	}
	
	@RequestMapping(value="/employeeDetail.html",method=RequestMethod.POST)
	public ModelAndView function1(@ModelAttribute("emp") Employee emp) {
		
		ModelAndView mav=new ModelAndView("display");
		return mav;
	}
	
	@InitBinder
	public void function2(WebDataBinder binder) {
		binder.setDisallowedFields("age");
	}
	
	@ModelAttribute
	public void commomAttribues(Model m) {
		m.addAttribute("msg","hello this is a message");
	}
	
	@RequestMapping("/showAll")
	public ModelAndView function3() {
		
		List<Employee> l=new ArrayList<>();
		List<String> s=new ArrayList<>();
		s.add("java");
		
	    l.add(new Employee("A", 12, "running",s,new Address("india","jabalpur",2324343)));
	 
	    ModelAndView mav=new ModelAndView("showall");
	    mav.addObject("list",l);
	    return mav;
	    
	}
}