package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.model.Authentication;
import com.ticket.model.User;
import com.ticket.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public String deleteUser(int id)
	{
		//Room room = findById(id);
		userRepo.deleteById(id);
		return "User Deleted Successfully";
	}
	
	public User addUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User updateUser(User user, int id)
	{	
		User existingUser = userRepo.findById(id).orElse(null);
		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		
		return userRepo.save(existingUser);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getUser(int id) {
		return userRepo.findById(id).get();
	}
	
	public String authenticateUser(Authentication auth)
	{
		List<User> list = userRepo.findAll();
		for(User user: list)
		{
			if(user.getEmail().equalsIgnoreCase(auth.getEmail()) && user.getPassword().equalsIgnoreCase(auth.getPassword()))
			{
				return "Succesful";
			}
		}
		return "unsuccessfull";
	}
}
