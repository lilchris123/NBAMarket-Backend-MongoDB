package com.nba.repository;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nba.model.Player;

@Repository
public interface PlayersRepository extends MongoRepository<Player,String>{
	public Set<Player> findByTeamName(String teamName);
}
