package com.MicroService.PriceRequest.Service;

import com.MicroService.PriceRequest.Repositories.PlaceRepository;
import com.MicroService.PriceRequest.models.Place;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PlaceService {

    public PlaceRepository repository;
    public PlaceService(PlaceRepository repository) {
        super();
        this.repository = repository;
    }
    public ResponseEntity<List<Place>> getAll() {
        List<Place> places = repository.findAll();

        return new ResponseEntity<>(places, HttpStatus.ACCEPTED);
    }
}
