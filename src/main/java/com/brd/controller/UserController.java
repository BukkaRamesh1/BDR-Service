package com.brd.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/saveUser")
	public JSONObject getData(@RequestBody JSONObject req) {
		
		JSONObject newObj = new JSONObject(req);
		
		newObj.put("name", req.getString("name"));
		newObj.put("address", req.getString("name"));
	
		
		return newObj;
		
	}
}
