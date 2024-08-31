package com.springSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.entities.User;
import com.springSecurity.services.UserServices;

@RestController
@RequestMapping("/users")
public class HomePageController {
	
	@Autowired
	private UserServices userServices;

	
	//all users
	@RequestMapping(value ="/api", method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return this.userServices.getAllUsers();
	}
	
	
	//return single user
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public User getUser(@PathVariable("username") String username) {
	return this.userServices.getUser(username);
	}
	
	
	//add user using post method
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public User add(@RequestBody User user) {
		return this.userServices.addUser(user);
		
	}
}
