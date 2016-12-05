package com.madhu.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madhu.common.dto.UserDTO;
import com.madhu.common.service.CustomUserService;

@Controller
public class WelcomeController {
	
	 private CustomUserService customuser = new CustomUserService();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeAdmin(ModelMap model) {

		model.addAttribute("message", "Welome to School");
		return "FormLoginAjax";

	}
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcomeUser(@RequestParam("Username") String username, @RequestParam("Password") String password,ModelMap model) {
		
		UserDTO userdto = customuser.getEmployeeLoginInfo(username, password);
		String returnpage = null;
		if(userdto!=null){
		switch (userdto.getRole()) {
		case "ADMIN":
			model.addAttribute("message", "Admin Logged in Successfully");
			returnpage = "Admin";
			break;
		case "TEACHER":
			model.addAttribute("message", "Teacher Logged in Successfully");
			returnpage = "Teacher";
			break;
		case "STUDENT":
			model.addAttribute("message", "Student Logged in Successfully");
			returnpage = "Student";
			break;
		default:
			model.addAttribute("message", "Access Denaied to this user, User doesn't passed Authentication");
			returnpage = "AccessDenied";
			break;
		}
		}else{
			model.addAttribute("message", "Access Denaied! , Authentication Failed");
			returnpage = "AccessDenied";
		}
		return returnpage;

	}
	/*@RequestMapping(value = "/getEmpDetails", method = RequestMethod.GET)
	public @ResponseBody
	String getEmpDetails(@RequestParam("Username") String username, @RequestParam("Password") String password,ModelMap model) {
		
		UserDTO userdto = customuser.getEmployeeLoginInfo(username, password);
		//model.addAttribute("role", userdto.getRole());
		String returnpage = "FormLoginAjax";
		
		return userdto.getRole();
		
	}*/
	@RequestMapping(value = "/getEmpDetails", method = RequestMethod.GET, produces="application/json")
	public  @ResponseBody 
	List<List<UserDTO>> getEmpDetails(@RequestParam("Username") String username, @RequestParam("Password") String password) {
		UserDTO userdto = customuser.getEmployeeLoginInfo(username, password);
		
		UserDTO userdtoOne = new UserDTO();
		userdtoOne.setFirstName("Amed");
		userdtoOne.setLastName("D");
		userdtoOne.setPassword("4567");
		userdtoOne.setRole("TEACHER");
		userdtoOne.setUsername("Amed");
		
		UserDTO userdtotwo = new UserDTO();
		userdtotwo.setFirstName("kiran");
		userdtotwo.setLastName("D");
		userdtotwo.setPassword("6789");
		userdtotwo.setRole("ADMIN");
		userdtotwo.setUsername("kiran");
		
		List<List<UserDTO>> listofattendence = new ArrayList<List<UserDTO>>();
		List<UserDTO> ondayattend= new ArrayList<UserDTO>();
		ondayattend.add(userdto);
		List<UserDTO> sevenDayattend = new ArrayList<UserDTO>();
		sevenDayattend.add(userdtoOne);
		sevenDayattend.add(userdtotwo);
		
		
		listofattendence.add(ondayattend);
		listofattendence.add(sevenDayattend);
		
		return listofattendence;
	}
	
}