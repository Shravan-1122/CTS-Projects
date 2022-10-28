package com.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ticket.model.Tic;

public interface TicRepo extends MongoRepository<Tic, Integer>{

}
