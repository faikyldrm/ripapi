package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.bean.User;

@Component
public class UserServiceImpl implements UserService{
	
	public static List<User> users = new ArrayList<>();
	
	static {
		User admin = new User(1,"Cuneyt Gudek", "admin@cgudek.com");
		User support = new User(2,"Faik Yildirim", "support@fyildirim.com");
		User test = new User(3,"Feyyaz Mutlu", "test@fmutlu.com");
		
		users.add(admin);
		users.add(support);
		users.add(test);
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUsersById(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}
