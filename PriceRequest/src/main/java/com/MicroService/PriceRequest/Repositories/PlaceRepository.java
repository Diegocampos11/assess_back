package com.MicroService.PriceRequest.Repositories;

import com.MicroService.PriceRequest.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
