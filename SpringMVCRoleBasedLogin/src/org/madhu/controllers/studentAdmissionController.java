package org.madhu.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class studentAdmissionController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView mv = new ModelAndView("AdmissionForm");
		/*mv.addObject("headerMessage","VTU college of Engineering,Welcomes you");*/
		return mv;
	}
	//@RequestParam concept
	/*@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby){
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		mv.addObject("msg","Details submitted by you Name: "+name+", Hobby: " +hobby);
		
		return mv;
	}*/
	
	
	//@ModelAttrribute concept with out using @Modelattribute annotation
	/*@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby){
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		
		student stud = new student();
		stud.setStudentName(name);
		stud.setStudentHobby(hobby);
		
		mv.addObject("headerMessage","VTU college of Engineering,Welcomes you");
		mv.addObject("studentobj", stud);
		
		return mv;
	}*/
	
	
	//@ModelAttrribute concept with out using @Modelattribute annotation
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("studentobj") student stud, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView mv = new ModelAndView("AdmissionForm");
			return mv;
		}
		
		ModelAndView mv = new ModelAndView("AdmissionSuccess");
		
		/*mv.addObject("headerMessage","VTU college of Engineering,Welcomes you");*/
	
		
		return mv;
	}
	@ModelAttribute
	public void addingCommonObject(Model model){
		model.addAttribute("headerMessage","VTU college of Engineering,Welcomes you");
	}
	

}
