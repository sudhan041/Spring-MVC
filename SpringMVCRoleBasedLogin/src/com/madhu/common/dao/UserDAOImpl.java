package com.madhu.common.dao;

import org.springframework.stereotype.Repository;

import com.madhu.common.dto.UserDTO;

@Repository
public class UserDAOImpl {
	
	 public UserDTO loadUserByUsernameAndPassword(final String username,final String password) {
		 //Write your DB call code to get the user details from DB,But I am just hard coding the user
		 	UserDTO userobj = new UserDTO();
		 	userobj.setFirstName("Madhu");
		 	userobj.setLastName("Sudhan");
		 	userobj.setUsername("Madhu");
		 	userobj.setPassword("1234");
		 	userobj.setRole("STUDENT");
		 	//if you get empty record for the DB call / if you want display access denaied msg , assign null to "userobj" : as specifed below
		 	//userobj = null;
		 	
		 	
	        return userobj;
	        
	        
	    }
	
	
}
