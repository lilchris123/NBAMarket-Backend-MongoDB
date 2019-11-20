package com.nba.repository;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,String>{

	Set<Order> findAllByUserId(String userId);


}
