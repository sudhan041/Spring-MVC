package com.madhu.common.dao;

import java.util.ArrayList;
import java.util.List;

import com.madhu.common.dto.UserDTO;

public interface UserDAO {
	
	public UserDTO loadUserByUsername(final String username);
}
