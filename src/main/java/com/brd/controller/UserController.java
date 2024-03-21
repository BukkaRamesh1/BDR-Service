package com.brd.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdr.model.User;
import com.bdr.service.UserService;

import Exception.ExceptionHandler;
import Exception.UserNotFoundException;

@RestController
@RequestMapping("/user")

@ControllerAdvice
public class UserController {
	
	
	@Autowired
	User user;
	
	@Autowired
	UserService userService;

	//@PostMapping("/saveUser")
	public JSONObject getData(@RequestBody JSONObject req) {
		
		JSONObject newObj = new JSONObject(req);
		
		newObj.put("name", req.getString("name"));
		newObj.put("address", req.getString("name"));
	
		
		
		
		return newObj;
		
	}
	
	/*
	 * 
	 *  {
	 *   "userName" : "Alex",
	 *   "userAddress" : "VA",
	 *   "userNumber" : "123456"
	 *  
	 *  }
	 * 
	 */
	@ExceptionHandler(UserNotFoundException.class)
	@PostMapping("/saveUser") // https://google.com/saveUser
	public User saveUser(@RequestBody User user) {
		return userService.createUser(user);
		
	}
}
