package com.springSecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springSecurity.entities.User;

@Service
public class UserServices {

	List<User> list=new ArrayList<>();
	
	public UserServices() {
		list.add(new User("John","Marrek","john@gmail.com"));
		list.add(new User("Henry","Kemp","henry@gmail.com"));
	}
	
	
	
	//get all users
	public List<User> getAllUsers(){
		return this.list;
		
	}
	
	
	//get single user
	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	
	//add new User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
