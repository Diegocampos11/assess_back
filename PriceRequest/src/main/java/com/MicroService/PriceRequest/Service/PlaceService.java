package com.MicroService.PriceRequest.Service;

import com.MicroService.PriceRequest.Repositories.PlaceRepository;
import com.MicroService.PriceRequest.models.Place;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    public PlaceRepository repository;
    public PlaceService(PlaceRepository repository) {
        super();
        this.repository = repository;
    }
    public ResponseEntity<List<Place>> getAllPlaces() {
        List<Place> places = repository.findAll();

        return new ResponseEntity<>(places, HttpStatus.ACCEPTED);
    }

}
