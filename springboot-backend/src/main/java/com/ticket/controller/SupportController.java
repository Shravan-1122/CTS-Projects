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

import com.ticket.model.Support;
import com.ticket.service.SupportService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SupportController {
	@Autowired
	private SupportService supportService;
	
	
	@GetMapping("/tic")
	public List<Support> showSupport(){
		return supportService.getAllSupport();
	}
	
	@GetMapping("/tic/{id}")
	public Support showSupport(@PathVariable int id)
	{
		return supportService.getSupport(id);
	}
	
	@PostMapping("/tic")
	public Support addSupport(@RequestBody Support support)
	{
		return supportService.addSupport(support);
	}
	
	@PutMapping("/tic/{id}")
	public ResponseEntity<Support> updateSupport(@RequestBody Support support, @PathVariable int id)
	{
		supportService.updateSupport(support, id);
		return new ResponseEntity<Support>(support, HttpStatus.OK);
	}
	
	@DeleteMapping("/tic/{id}")
	public String deleteSupport(@PathVariable int id)
	{
		return supportService.deleteSupport(id);
	}

}
