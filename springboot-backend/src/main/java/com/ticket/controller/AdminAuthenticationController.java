package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.model.Admin;
import com.ticket.model.Authentication;
import com.ticket.model.User;
import com.ticket.service.AdminService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdminAuthenticationController 
{
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public List<Admin> showAdmin(){
		return adminService.getAllAdmins();
	}
	
	@GetMapping("/admin/{id}")
	public Admin showUser(@PathVariable int id)
	{
		return adminService.getAdmin(id);
	}
	
	@PostMapping("/admin")
	public Admin addUser(@RequestBody Admin admin)
	{
		return adminService.addAdmin(admin);
	}
	
	@PostMapping("/admin-basicauth")
	public Admin getAdminDataForValidation(@RequestBody Authentication auth)
	{
		Admin credentialsMatched;
		credentialsMatched = adminService.authenticateAdmin(auth);
		return credentialsMatched;
	}
}

