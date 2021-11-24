package com.bezkoder.springjwt.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Flight {
	@Id
	int flight_id;
	String flight_name;
	String departure_loc;
	String Arrival_loc;
	String flight_status;
	String flight_trip_status;
	Date flight_departure_date;
	
	@OneToOne(mappedBy="flight")
	Ticket ticket;
	
	public int getFlight_id() {
		return flight_id;
	}
	public Date getFlight_departure_date() {
		return flight_departure_date;
	}
	public void setFlight_departure_date(Date flight_departure_date) {
		this.flight_departure_date = flight_departure_date;
	}
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getDeparture_loc() {
		return departure_loc;
	}
	public void setDeparture_loc(String departure_loc) {
		this.departure_loc = departure_loc;
	}
	public String getArrival_loc() {
		return Arrival_loc;
	}
	public void setArrival_loc(String arrival_loc) {
		Arrival_loc = arrival_loc;
	}
	public String getFlight_status() {
		return flight_status;
	}
	public void setFlight_status(String flight_status) {
		this.flight_status = flight_status;
	}
	public String getFlight_trip_status() {
		return flight_trip_status;
	}
	public void setFlight_trip_status(String flight_trip_status) {
		this.flight_trip_status = flight_trip_status;
	}
	

}
