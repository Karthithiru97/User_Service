package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Flight;
import com.bezkoder.springjwt.repository.FlightRepository;




@Service
public class FlightService {
	@Autowired
	FlightRepository flightrepo;

	public Integer save(Flight flight) {
		// TODO Auto-generated method stub
		Integer flightid=flightrepo.save(flight).getFlight_id();
		return flightid;
	}

	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return flightrepo.findAll();
	}

}
