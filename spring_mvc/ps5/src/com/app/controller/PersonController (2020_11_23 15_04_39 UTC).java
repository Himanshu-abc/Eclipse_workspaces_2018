package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.entity.Person;

@Controller
public class PersonController {
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView function1() {
		Person p=new Person();
		ModelAndView mav=new ModelAndView("form","p",p);
		return mav;
	}

	@ModelAttribute
	public void commonmethod(Model m) {
		m.addAttribute("message","this is a person data");
	}
	
	@InitBinder
	public void function3(WebDataBinder binder) {
		
		/*binder.setDisallowedFields(new String[] {"age"});*/
		SimpleDateFormat sdf=new SimpleDateFormat("dd//mm//yyyy");
		binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(sdf, false));
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView function2(@Valid @ModelAttribute("p") Person p, BindingResult result) {
		
		if (result.hasErrors()) {
			ModelAndView mav=new ModelAndView("form");
			return mav;
		}
		ModelAndView mav=new ModelAndView("display");
		return mav;
	}
}