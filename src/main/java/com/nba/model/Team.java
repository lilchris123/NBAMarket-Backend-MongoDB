package com.nba.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="teams")
public class Team {
	
	@Id
	private String id;
	private String name;
	private String location;
	
	@Field(value="offensive_rating")
	private int offensiveRating;
	@Field(value="defensive_rating")
	private int defensiveRating;
	@Field(value="overall_rating")
	private int overallRating;
	
	private Set<Player> players;
	
	public Team() {};
	public Team(String id, String name, String location, int offensiveRating, int defensiveRating, int overallRating, Set<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.offensiveRating = offensiveRating;
		this.defensiveRating = defensiveRating;
		this.overallRating = overallRating;
		this.players= players;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOffensiveRating() {
		return offensiveRating;
	}
	public void setOffensiveRating(int offensiveRating) {
		this.offensiveRating = offensiveRating;
	}
	public int getDefensiveRating() {
		return defensiveRating;
	}
	public void setDefensiveRating(int defensiveRating) {
		this.defensiveRating = defensiveRating;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	

}
