package com.Microservice.bookFlight.Repositories;


import com.Microservice.bookFlight.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PriceRequestRepository extends JpaRepository<Trip, Integer> {
}
