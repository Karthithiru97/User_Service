package com.flight.booking.security.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.booking.models.Ticket;
import com.flight.booking.models.User;
import com.flight.booking.repository.TicketRepository;
import com.flight.booking.repository.UserRepository;



@Service
public class TicketService {
	@Autowired
	TicketRepository ticketrepo;
	
	@Autowired
	UserRepository userrepo;
	
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

	public List<Ticket> findticketsbyemail(String email) {
		// TODO Auto-generated method stub
		List<Ticket> tickets=
				ticketrepo.findallbyMailId(email);
		return tickets;
	}



	public void cancelTicket(Integer pnr) {
		// TODO Auto-generated method stub
		ticketrepo.updateStatus(pnr);
	}

}
