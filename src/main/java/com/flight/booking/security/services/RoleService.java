package com.flight.booking.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.models.ERole;
import com.flight.booking.models.Role;
import com.flight.booking.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;

	public Optional<Role> findByName(ERole roleUser) {
		// TODO Auto-generated method stub
		return roleRepository.findByName(roleUser);
	}
	
	

}
