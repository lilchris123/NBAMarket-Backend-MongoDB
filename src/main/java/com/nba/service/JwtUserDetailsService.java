package com.nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nba.dto.UserDTO;
import com.nba.mapper.NbaMapper;

import com.nba.model.Users;
import com.nba.repository.UserRepository;

@Service
public class JwtUserDetailsService  implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private NbaMapper nbaMapper;

	@Override
	public Users loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		 return user;
	}
	
	public Users save(UserDTO user) {
		return userRepository.save(nbaMapper.toEntity(user));
	}

	
}
