package com.flight.booking.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.booking.models.Ticket;
import com.flight.booking.repository.TicketRepository;



@Service
public class TicketService {
	@Autowired
	TicketRepository ticketrepo;
	
	public Integer bookticket(Ticket ticket) {
		// TODO Auto-generated method stub
		Integer pnrNum=ticketrepo.save(ticket).getPNR_Number();
		return pnrNum;
	}

	public Ticket findticketsbyPNR(int pnr) {
		return ticketrepo.FindByPNR_Number(pnr);
		// TODO Auto-generated method stub
		
	}

	public int save(Ticket ticket) {
		// TODO Auto-generated method stub
		Integer pnr=ticketrepo.save(ticket).getPNR_Number();
		return pnr;
	}

}
