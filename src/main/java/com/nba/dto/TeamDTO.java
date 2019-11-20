package com.nba.dto;

import java.util.Set;

import com.nba.model.Player;

public class TeamDTO {
	
	private String id;
	private String name;
	private String location;
	private int offensiveRating;
	private int defensiveRating;
	private int overallRating;
	private Set<Player> players;
	
	
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
