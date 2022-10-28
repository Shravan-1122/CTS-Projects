package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.model.Admin;

public interface AdminRepo extends MongoRepository<Admin, Integer>{

}
