package com.rest.service;

import java.util.List;

import com.rest.bean.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User getUsersById(int id);
	
	

}
