package com.flight.booking.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.repository.UserRepository;

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
