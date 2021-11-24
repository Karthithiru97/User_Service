package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.repository.UserRepository;

@Service
public class AuthendicationService {
	
	@Autowired
	UserRepository userRepository;
	
	public boolean existsByUsername(String username)
	{
		return userRepository.existsByUsername(username);
	}

	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.existsByEmail(email);
	}

}
