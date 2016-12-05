package com.madhu.common.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.madhu.common.dao.UserDAOImpl;
import com.madhu.common.dto.UserDTO;



public class CustomUserService {

	 private UserDAOImpl userDao = new UserDAOImpl();
	 
	 
	public UserDTO getEmployeeLoginInfo(String username,String password) {
		return userDao.loadUserByUsernameAndPassword(username,password);
	}

}
