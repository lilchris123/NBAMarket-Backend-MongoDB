package com.nba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.Team;

@Repository
public interface TeamsRepository extends MongoRepository<Team, String> {
	
	public Team findByName(String name);
}
