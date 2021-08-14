package com.app.bean_and_controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@InitBinder
	public void function3(WebDataBinder binder) {
		/*binder.setDisallowedFields(new String[] {"mobileNumber"});*/
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class, "DOB",new CustomDateEditor(sdf, false));
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}

	@RequestMapping(value="/StudentForm" , method=RequestMethod.GET)
	public ModelAndView function1() throws Exception{
		
		String exception="ArithmeticException";
		
		if(exception.equalsIgnoreCase("NullPointerException")) {
			
			throw new NullPointerException("Null Pointer Exception");
		}
		else if(exception.equalsIgnoreCase("IOException"))
		{
			throw new IOException("IO Exception");
		}
		else if(exception.equalsIgnoreCase("ArithmeticException"))
		{
			throw new Exception("Generic Exception ");
		}
		
		ModelAndView mav=new ModelAndView("StudentForm");
		mav.addObject("message1","please fill your details");
		return mav;
	}
	
	@ModelAttribute
	public void CommomMethod(Model model) {
		model.addAttribute("message","Trinity School of Grammer");
	}
	
	@RequestMapping(value="/StudentDetail.html" , method=RequestMethod.POST)
	public ModelAndView function2( @Valid @ModelAttribute("student") Student student, 
			BindingResult result){
	 
	if(result.hasErrors()) {
		ModelAndView m=new ModelAndView("StudentForm");
		return m;
	}
	
	else {
	ModelAndView mav=new ModelAndView("Display");
	mav.addObject("message2","congratulation ! , you are successfully enrolled");
	return mav;
	}
	}
	@ExceptionHandler(value=NullPointerException.class)
	public String function4(Exception e) {
		
		System.out.println("Null Pointer Exception "+e);
		return "NullPointerException";
	}
	@ExceptionHandler(value=IOException.class)
	public String function5(Exception e) {
		
		System.out.println("IO Exception Occured" + e);
		return "IOException";
	}
	@ExceptionHandler(value=Exception.class)
	public String function6(Exception e) {
		
		System.out.println("Exception occured "+e);
		return "Exception";
	}
}
