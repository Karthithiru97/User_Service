package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.FlightUser;


public interface UserServiceRepository extends JpaRepository<FlightUser,Integer> {

}
