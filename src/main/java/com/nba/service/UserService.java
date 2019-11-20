package com.nba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.model.Users;
import com.nba.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Users getUser(String username){
		return userRepository.findByUsername(username);
	}
	
	public void createUser(Users user){
		userRepository.save(user);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
		
	}
}
