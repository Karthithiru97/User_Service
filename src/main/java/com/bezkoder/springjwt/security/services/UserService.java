package com.bezkoder.springjwt.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.FlightUser;
import com.bezkoder.springjwt.repository.UserServiceRepository;



@Service
public class UserService {
	@Autowired
	UserServiceRepository userrepo;

	public Integer save(FlightUser user) {
		// TODO Auto-generated method stub
		Integer userid=userrepo.save(user).getId();
		return userid;
	}

	public List<FlightUser> findAll() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	public Optional<FlightUser> find(int id) {
		// TODO Auto-generated method stub
		return userrepo.findById(id);
	}

}
