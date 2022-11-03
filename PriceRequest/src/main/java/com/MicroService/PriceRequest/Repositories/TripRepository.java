package com.MicroService.PriceRequest.Repositories;

import com.MicroService.PriceRequest.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface TripRepository extends JpaRepository<Trip, Integer> {
    List<Trip> findByOrigin_name(String name);
    List<Trip> findByDestination_name(String name);
    List<Trip> findByCompany(String name);
    List<Trip> findByDate(LocalDate date);

    List<Trip> findByOrigin_nameAndDestination_name(String origin, String destination);


}
