package com.MicroService.PriceRequest.Repositories;

import com.MicroService.PriceRequest.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceRequestRepository extends JpaRepository<Trip, Integer> {
    List<Trip> findByOrigin_name(String name);
    List<Trip> findByCompany(String name);
}
