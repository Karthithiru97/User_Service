package com.bezkoder.springjwt.controllers;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Flight;
import com.bezkoder.springjwt.models.FlightUser;
import com.bezkoder.springjwt.models.Ticket;
import com.bezkoder.springjwt.repository.TicketRepository;
import com.bezkoder.springjwt.security.services.FlightService;
import com.bezkoder.springjwt.security.services.UserService;




@RestController
public class UserController {
	@Autowired
	UserService userservice;
	@Autowired
	FlightService flightservice;
	@Autowired
	TicketRepository ticketrepo;
	
	@PostMapping("/user")
	@ResponseStatus(code=HttpStatus.CREATED)
	Integer saveUser(@Valid @RequestBody FlightUser user) {
		return userservice.save(user);
	}
	
	@PostMapping("/airlines")
	@PreAuthorize("hasRole('ADMIN')")
	Integer createAirlines(@RequestBody Flight flight) {
		
		return flightservice.save(flight);
	}
	
	@GetMapping("/search")
    List<Flight> search()
    {
	  return flightservice.findAll();
    }
	@GetMapping("/users")
	  List<FlightUser> findusers()
	  {
		  return userservice.findAll();
	  }
	/*@GetMapping("/user")
	  FlightUser finduser()
	  {
		  return userservice.find(1).get();
	  }*/
	@PostMapping("/bookticket")
	@PreAuthorize("hasRole('USER')")
	Integer bookTicket(@RequestBody Ticket ticket)
	{
		Integer pnr=ticketrepo.save(ticket).getPNR_Number();
	return pnr;
	}
	
	
	
	}


