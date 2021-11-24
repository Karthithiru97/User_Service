package com.bezkoder.springjwt.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;

	public Optional<Role> findByName(ERole roleUser) {
		// TODO Auto-generated method stub
		return roleRepository.findByName(roleUser);
	}
	
	

}
