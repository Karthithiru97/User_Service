package com.flight.booking.models;






import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer PNR_Number;


	
	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="flight_id",nullable = false)
	Flight flight;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="user_id",nullable = false)
	User user;
	

	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	String Status;





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
