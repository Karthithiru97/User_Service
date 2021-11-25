package com.flight.booking.repository;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.flight.booking.models.Ticket;
import com.flight.booking.models.User;




public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	@Query(value = "SELECT * FROM TICKET WHERE PNR_NUMBER =?1",nativeQuery=true)
	Ticket FindByPNR_Number(Integer PNR_Number);
    
	
	
	@Query(value="SELECT * FROM TICKET WHERE USER_ID IN(SELECT ID FROM USERS WHERE EMAIL=?1)",nativeQuery=true)
	List<Ticket> findallbyMailId(String email);

	@Transactional
	@Modifying
    @Query(value="UPDATE TICKET SET STATUS='CANCELED' WHERE PNR_NUMBER=?1",nativeQuery=true)
	 void updateStatus(Integer id);



}
