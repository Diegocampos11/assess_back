package com.MicroService.PriceRequest.Repositories;

import com.MicroService.PriceRequest.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PriceRequestRepository extends JpaRepository<Trip, Integer> {
}
