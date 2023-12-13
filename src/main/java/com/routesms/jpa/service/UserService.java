package com.routesms.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.routesms.jpa.entity.User;
import com.routesms.jpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {

		userRepository.save(user);

	}
	
	
	public Optional<User> loadUserById(String id) {
		
		return userRepository.findById(id);
	}

}
