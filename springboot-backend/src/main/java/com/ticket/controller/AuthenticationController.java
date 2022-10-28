package com.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.model.Authentication;
import com.ticket.model.User;
import com.ticket.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthenticationController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public User getUserDataForValidation()
	{
		return null;
	}
	
	
	@PostMapping("/basicauth")
	public String getUserDataForValidation(@RequestBody Authentication auth)
	{
		String credentialsMatched;
		credentialsMatched = userService.authenticateUser(auth);
		return credentialsMatched;
	}
}

