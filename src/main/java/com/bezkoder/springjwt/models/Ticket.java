package com.bezkoder.springjwt.models;





import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;


@Entity
public class Ticket {
	@Id
	Integer ticket_id;




	public FlightUser getFlight_user() {
		return flight_user;
	}

	public void setFlight_user(FlightUser flight_user) {
		this.flight_user = flight_user;
	}



	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	Integer PNR_Number;
	
	@OneToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="flight_id",nullable = false)
	Flight flight;
	
	@OneToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="user_id",nullable = false)
	FlightUser flight_user;
	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	String Status;

	
	public Integer getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Integer getPNR_Number() {
		return PNR_Number;
	}

	public void setPNR_Number(Integer pNR_Number) {
		PNR_Number = pNR_Number;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	

}
