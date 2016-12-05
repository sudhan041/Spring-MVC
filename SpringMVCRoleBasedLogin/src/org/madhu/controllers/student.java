package org.madhu.controllers;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;

public class student {
	private String studentName;
	
	@isValidHobby
	private String studentHobby;
	
	@Max(2222)
	private Long studentMobile;
	
	@Past
	private Date studentDOB;

	private ArrayList<String> studentSkills;

	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	
	

}
