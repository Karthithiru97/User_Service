package com.flight.booking.controllers;


import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
	
	@GetMapping("/flight/search")
    List<Flight> search()
    {
	  return flightservice.findAll();
    }

	/*@GetMapping("/user")
	  FlightUser finduser()
	  {
		  return userservice.find(1).get();
	  }*/
	@PostMapping("/bookticket")
	//@PreAuthorize("hasRole('USER')")
	Integer bookTicket(@RequestBody Ticket ticket)
	{
		Integer pnr=ticketservice.save(ticket);
	    return pnr;
	}
	
	@GetMapping("/flight/ticket/{pnr}")
	public Ticket findticketsbyPNR(@PathVariable("pnr") int pnr)
	{
		return ticketservice.findticketsbyPNR(pnr);
		
	}
	
	
	}


