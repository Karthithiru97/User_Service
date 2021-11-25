package com.flight.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.booking.models.Flight;




public interface FlightRepository extends JpaRepository<Flight,Integer> {

}
