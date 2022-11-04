package com.Microservice.bookFlight.repositories;

import com.Microservice.bookFlight.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip,Integer> {


}
