package org.madhu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnnotation {

	@RequestMapping("/Welcome")
	public ModelAndView helloWorld(){
		ModelAndView mv = new ModelAndView("HelloPage");
		mv.addObject("welcomeMessage","Hi  user, Welcome to the First Spring application");
		
		return mv;
		
	}
}
