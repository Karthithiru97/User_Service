package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Flight;




public interface FlightRepository extends JpaRepository<Flight,Integer> {

}
