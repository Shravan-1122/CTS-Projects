package com.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.model.Tic;
import com.ticket.service.TicService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TicController {
	@Autowired
	private TicService ticService;
	
	@GetMapping("/ticket")
	public List<Tic> showTic(){
		return ticService.getAllTic();
	}
	
	@GetMapping("/ticket/{id}")
	public Tic showTic(@PathVariable int id)
	{
		return ticService.getTic(id);
	}
	
	@PostMapping("/ticket")
	public Tic addTic(@RequestBody Tic tic)
	{
		return ticService.addTic(tic);
	}
	
	@PutMapping("/ticket/{id}")
	public ResponseEntity<Tic> updateUser(@RequestBody Tic tic, @PathVariable int id)
	{
		ticService.updateTic(tic, id);
		return new ResponseEntity<Tic>(tic, HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{id}")
	public String deleteTic(@PathVariable int id)
	{
		return ticService.deleteTic(id);
	}

}
