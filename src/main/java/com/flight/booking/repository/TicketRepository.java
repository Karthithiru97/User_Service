package com.flight.booking.repository;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.flight.booking.models.Ticket;





public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	@Query(value = "SELECT * FROM TICKET WHERE PNR_NUMBER =?1",nativeQuery=true)
	Ticket FindByPNR_Number(Integer PNR_Number);
    
	
	
	@Query(value="SELECT * FROM TICKET WHERE USER_ID IN(SELECT ID FROM USERS WHERE EMAIL=?1)",nativeQuery=true)
	List<Ticket> findbyUserandEmail(String email);

	@Transactional
	@Modifying
    @Query(value="UPDATE TICKET SET STATUS='CANCELED' WHERE PNR_NUMBER=?1",nativeQuery=true)
	 void updateStatus(Integer id);



}
