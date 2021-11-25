package com.flight.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flight.booking.models.Ticket;




public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	@Query(value = "SELECT * FROM TICKET WHERE PNR_NUMBER =?1",nativeQuery=true)
	Ticket FindByPNR_Number(Integer PNR_Number);

}
