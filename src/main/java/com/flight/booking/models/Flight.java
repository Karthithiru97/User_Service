package com.flight.booking.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Flight {
	@Id
	private Integer flight_id;
	private String flight_name;
	private String departure_loc;
	private String Arrival_loc;
	private String flight_status;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ETripStatus flight_trip_status;
	
	private Date flight_departure_date;
	private Date flight_arrival_date;
	private Integer price;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private EMeal meal_type;
	
	
	@OneToMany(mappedBy="flight")
	private Set<Ticket> ticket=new HashSet<>();
	
	public Flight()
	{
		
	}
	
	public Flight(EMeal meal_type)
	{
		this.meal_type=meal_type;
	
	}
	public ETripStatus getFlight_trip_status() {
		return flight_trip_status;
	}

	public void setFlight_trip_status(ETripStatus flight_trip_status) {
		this.flight_trip_status = flight_trip_status;
	}

	public Date getFlight_arrival_date() {
		return flight_arrival_date;
	}

	public void setFlight_arrival_date(Date flight_arrival_date) {
		this.flight_arrival_date = flight_arrival_date;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Flight(ETripStatus flight_trip_status)
	{
		this.flight_trip_status=flight_trip_status;
	
	}
	public EMeal getMeal_type() {
		return meal_type;
	}

	public void setMeal_type(EMeal meal_type) {
		this.meal_type = meal_type;
	}

	public Integer getFlight_id() {
		return flight_id;
	}
	public Date getFlight_departure_date() {
		return flight_departure_date;
	}
	public void setFlight_departure_date(Date flight_departure_date) {
		this.flight_departure_date = flight_departure_date;
	}
	

	public Set<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(Set<Ticket> ticket) {
		this.ticket = ticket;
	}

	public void setFlight_id(Integer flight_id) {
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

	

}
