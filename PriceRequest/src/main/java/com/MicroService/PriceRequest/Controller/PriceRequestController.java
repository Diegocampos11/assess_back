package com.MicroService.PriceRequest.Controller;


import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
import com.MicroService.PriceRequest.models.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/api/trips")
public class PriceRequestController {

    public PriceRequestRepository repository;

    public PriceRequestController(PriceRequestRepository repository) {
        super();
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping (path = "/all")
    public ResponseEntity<List<Trip>> test() {
        List<Trip> trips = repository.findAll();

        return new ResponseEntity<>(trips, HttpStatus.ACCEPTED);

    }
    @GetMapping(path = "/price")

    public void getPrice() {
    }
}
