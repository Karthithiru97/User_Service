package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Ticket;




public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
