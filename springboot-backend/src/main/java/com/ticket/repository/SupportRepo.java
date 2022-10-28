package com.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.model.Support;

public interface SupportRepo extends MongoRepository<Support, Integer>{

}
