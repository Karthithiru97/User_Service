package com.flight.booking.models;






import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PNR_Number;


	
	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="flight_id",nullable = false)
	@JsonBackReference
	private Flight flight;
	
	public User getUser() {
		return user;
	}
	@Range(min=1,max=10)
    private Integer number_of_seats;
	public Integer getNumber_of_seats() {
		return number_of_seats;
	}

	public void setNumber_of_seats(Integer number_of_seats) {
		this.number_of_seats = number_of_seats;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="user_id",nullable = false)
	@JsonBackReference
	private User user;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ETicketStatus status;
	

	public Ticket()
	{
		
	}
	public Ticket(ETicketStatus status)
	{
		this.status=status;
	}
	
	public ETicketStatus getStatus() {
		return status;
	}

	public void setStatus(ETicketStatus status) {
		this.status = status;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	





	public Integer getPNR_Number() {
		return PNR_Number;
	}

	public void setPNR_Number(Integer pNR_Number) {
		PNR_Number = pNR_Number;
	}


	

}
