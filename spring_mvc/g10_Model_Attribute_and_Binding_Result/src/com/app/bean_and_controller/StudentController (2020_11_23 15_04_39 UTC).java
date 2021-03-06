package com.app.bean_and_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/StudentForm" , method=RequestMethod.GET)
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("StudentForm");
		mav.addObject("message1","please fill your details");
		return mav;
	}
	
	@ModelAttribute
	public void CommomMethod(Model model) {
		model.addAttribute("message","Trinity School of Grammer");
	}
	
	@RequestMapping(value="/StudentDetail.html" , method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="student") Student student, BindingResult result) {
	
	if(result.hasErrors()) {
		ModelAndView m=new ModelAndView("StudentForm");
		return m;
	}
	
	ModelAndView mav=new ModelAndView("Display");
	mav.addObject("message2","congratulation ! , you are successfully enrolled");
	return mav;
	}
}
