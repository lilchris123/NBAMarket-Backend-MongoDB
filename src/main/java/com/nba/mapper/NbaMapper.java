package com.nba.mapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.nba.dto.OrderDTO;
import com.nba.dto.PlayerDto;
import com.nba.dto.TeamDTO;
import com.nba.dto.UserDTO;
import com.nba.model.Order;
import com.nba.model.Player;
import com.nba.model.Team;
import com.nba.model.Users;

@Component
public class NbaMapper {
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	public Player toEntity(PlayerDto dto) {
		Player nba= new Player();
		nba.setId(dto.getId());
		nba.setFirst_name(dto.getFirst_name());
		nba.setLast_name(dto.getLast_name());
		nba.setTeam_name(dto.getTeam_name());
		nba.setPosition(dto.getPosition());
		nba.setOverall(dto.getOverall());
		
		return nba;
	}
	
	public PlayerDto toDto(Player entity) {
		PlayerDto dto =new PlayerDto();
		dto.setId(entity.getId());
		dto.setFirst_name(entity.getFirst_name());
		dto.setLast_name(entity.getLast_name());
		dto.setTeam_name(entity.getTeam_name());
		dto.setPosition(entity.getPosition());
		dto.setOverall(entity.getOverall());
		return dto;
	}
	
	public Team toEntity(TeamDTO dto) {
		Team team= new Team();
		team.setId(dto.getId());
		team.setName(dto.getName());;
		team.setLocation(dto.getLocation());
		team.setOffensiveRating(dto.getOffensiveRating());
		team.setDefensiveRating(dto.getDefensiveRating());
		team.setOverallRating(dto.getOffensiveRating());
		team.setPlayers(dto.getPlayers());
		return team;
	}
	
	public TeamDTO toDto(Team team) {
		TeamDTO dto= new TeamDTO();
		dto.setId(team.getId());
		dto.setName(team.getName());
		dto.setLocation(team.getLocation());
		dto.setOffensiveRating(team.getOffensiveRating());
		dto.setDefensiveRating(team.getDefensiveRating());
		dto.setOverallRating(team.getOverallRating());
		dto.setPlayers(team.getPlayers());
		return dto;
	}
	public Users toEntity(UserDTO user) {
		Users newUser = new Users();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setFirst_name(user.getFirst_name());
		newUser.setLast_name(user.getLast_name());
		newUser.setRole(user.getRole());
		return newUser;
	}
	
	public OrderDTO toDto(Order order) {
		OrderDTO dto= new OrderDTO();
		dto.setOrderId(order.getOrderId());
		dto.setUserId(order.getUserId());
		dto.setUser_name(order.getUser_name());
		dto.setUser_email(order.getUser_email());
		dto.setUser_address(order.getUser_address());
		dto.setAuth_code(order.getAuth_code());
		dto.setShipped(order.isShipped());
		dto.setCart(order.getCart());
		return dto;
	}

}
