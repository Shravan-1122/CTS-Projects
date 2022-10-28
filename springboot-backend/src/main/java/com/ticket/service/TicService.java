package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.model.Tic;
import com.ticket.repository.TicRepo;

@Service
public class TicService {

	@Autowired
	private TicRepo ticRepo;
	
	public String deleteTic(int id)
	{
		ticRepo.deleteById(id);
		return "Ticket Deleted Successfully";
	}
	
	public Tic addTic(Tic tic)
	{
		return ticRepo.save(tic);
	}
	
	public Tic updateTic(Tic tic, int id)
	{	
		Tic existingUser = ticRepo.findById(id).orElse(null);
		existingUser.setSummary(tic.getSummary());
		existingUser.setPriority(tic.getPriority());
		existingUser.setCreatedBy(tic.getCreatedBy());
		existingUser.setDescription(tic.getDescription());
		existingUser.setCreatedDate(tic.getCreatedDate());
		existingUser.setType(tic.getType());
		existingUser.setResolveDate(tic.getResolveDate());
		existingUser.setUpdatedDate(tic.getUpdatedDate());
		existingUser.setComment(tic.getComment());
		existingUser.setAssignee(tic.getAssignee());
		
		
		return ticRepo.save(existingUser);
	}
	
	public List<Tic> getAllTic(){
		return ticRepo.findAll();
	}
	
	public Tic getTic(int id) {
		return ticRepo.findById(id).get();
	}
	
}
