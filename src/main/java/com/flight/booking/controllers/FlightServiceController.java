package com.flight.booking.controllers;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.models.Flight;
import com.flight.booking.models.Ticket;
import com.flight.booking.security.services.FlightService;
import com.flight.booking.security.services.TicketService;





@RestController
public class FlightServiceController {

	@Autowired
	FlightService flightservice;
	@Autowired
	TicketService ticketservice;
	
	
	@PostMapping("/airlines")
	@PreAuthorize("hasRole('ADMIN')")
	Integer createAirlines(@RequestBody Flight flight) {
		
		return flightservice.save(flight);
	}
	
	//anyone can search for flight
	@PostMapping("/flight/search")
    List<Flight> search()
    {
	  return flightservice.findAll();
    }

	
	@PostMapping("/flight/bookticket")
	@PreAuthorize("hasRole('USER')")
	Integer bookTicket(@RequestBody Ticket ticket)
	{
		Integer pnr=ticketservice.save(ticket);
	    return pnr;
	}
	
	@GetMapping("/flight/ticket/{pnr}")
	@PreAuthorize("hasRole('USER')")
	public Ticket findticketsbyPNR(@PathVariable("pnr") int pnr)
	{
		return ticketservice.findticketsbyPNR(pnr);
		
	}

	@GetMapping("/flight/tickets/{email}")
	//@PreAuthorize("hasRole('USER')")
	public List<Ticket> findticketsbyemail(@PathVariable("email") String email)
	{
	
		List<Ticket> tickets=ticketservice.findticketsbyemail(email);
		return tickets;
	}
	
	@DeleteMapping("/flight/cancel/{pnr}")
	@PreAuthorize("hasRole('USER')")
	public BodyBuilder cancelTicket(@PathVariable("pnr") Integer pnr)
	{
		ticketservice.cancelTicket(pnr);
	return ResponseEntity.ok();
	}
	
	
	}


