package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Ticket;
import com.bezkoder.springjwt.repository.TicketRepository;



@Service
public class TicketService {
	@Autowired
	TicketRepository ticketrepo;
	
	public Integer bookticket(Ticket ticket) {
		// TODO Auto-generated method stub
		Integer pnrNum=ticketrepo.save(ticket).getPNR_Number();
		return pnrNum;
	}

}
