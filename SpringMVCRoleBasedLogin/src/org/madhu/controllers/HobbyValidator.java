package org.madhu.controllers;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class HobbyValidator implements ConstraintValidator<isValidHobby, String> {
	
	private String listOfhobbies;
 
    @Override
    public void initialize(isValidHobby isValidHobby) { 
    	
    	this.listOfhobbies = isValidHobby.listOfValidHobbies();
    	
    }
 
    @Override
    public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
        
    	if(studentHobby == null) {
    		
            return false;
        }
        
    	if (studentHobby.matches(listOfhobbies)) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
 
}