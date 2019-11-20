package com.nba.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nba.dto.PlayerDto;
import com.nba.mapper.NbaMapper;
import com.nba.model.Player;
import com.nba.repository.PlayersRepository;

@Service
public class PlayersService {
	
	private final PlayersRepository playersRepository;
	private final NbaMapper nbaMapper;
	
	public PlayersService(PlayersRepository nbaRepository, NbaMapper nbaMapper) {
		this.playersRepository= nbaRepository;
		this.nbaMapper= nbaMapper;
	}
	public Set<PlayerDto> findAll(){
		return playersRepository.findAll().stream().map(n-> nbaMapper.toDto(n)).collect(Collectors.toSet());
	}
	
	public PlayerDto findOne(String id) {
		Optional<Player> nbaOp= playersRepository.findById(id);
		if(nbaOp.isPresent())
			return nbaMapper.toDto(nbaOp.get());
		return null;
		
	}
	public PlayerDto save(PlayerDto nba) {
		Player entity=nbaMapper.toEntity(nba);
		Player saved=playersRepository.save(entity);
		return nbaMapper.toDto(saved);
	}
	
	public PlayerDto update(PlayerDto nba) {
		String nbaId= nba.getId();
		Optional<Player> findById= playersRepository.findById(nbaId);
		
		if(findById.isPresent()) {
			Player n=findById.get();
			n.setId(nba.getId());
			n.setFirst_name(nba.getFirst_name());
			n.setLast_name(nba.getLast_name());
			n.setTeam_name(nba.getTeam_name());
			n.setPosition(nba.getPosition());
			n.setOverall(nba.getOverall());
			Player saved= playersRepository.save(n);
			return nbaMapper.toDto(saved);
		}
		else
			throw new IllegalArgumentException();
	}
	public void delete(String id) {
		playersRepository.deleteById(id);
	}
	
	public Set<Player> getTeamPlayers(String team){
		return playersRepository.findByTeamName(team);
	}
}
