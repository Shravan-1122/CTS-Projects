package com.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.model.Support;
import com.ticket.repository.SupportRepo;
@Service
public class SupportService {
	
	
		
		@Autowired
		private SupportRepo supportRepo;
		
		public String deleteSupport(int id)
		{
			//Room room = findById(id);
			supportRepo.deleteById(id);
			return "Support Deleted Successfully";
		}
		
		public Support addSupport(Support support)
		{
			return supportRepo.save(support);
		}
		
		public Support updateSupport(Support support, int id)
		{	
			Support existingUser = supportRepo.findById(id).orElse(null);
			existingUser.setAdminsummary(support.getAdminsummary());
			existingUser.setCreatedDateadmin(support.getCreatedDateadmin());
			existingUser.setCommentadmin(support.getCommentadmin());
			existingUser.setAssigneeadmin(support.getAssigneeadmin());
			existingUser.setPriorityadmin(support.getPriorityadmin());
			existingUser.setResolveDateadmin(support.getResolveDateadmin());
			existingUser.setDescriptionadmin(support.getDescriptionadmin());
			existingUser.setCreatedByadmin(support.getCreatedByadmin());
			
			
			return supportRepo.save(existingUser);
		}
		
		public List<Support> getAllSupport(){
			return supportRepo.findAll();
		}
		
		public Support getSupport(int id) {
			return supportRepo.findById(id).get();
		}

}
