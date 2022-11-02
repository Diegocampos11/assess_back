package com.MicroService.PriceRequest.Controller;


import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
import com.MicroService.PriceRequest.Service.PriceRequestService;
import com.MicroService.PriceRequest.models.Trip;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/trips")
public class PriceRequestController {

    @Autowired
    private PriceRequestService service;

    public PriceRequestController(PriceRequestService service) {
        super();
        this.service = service;
    }

    @CrossOrigin
    @GetMapping(path = "/all")
    public ResponseEntity<List<Trip>> getAll() {
        return service.getAll();

    }

    @CrossOrigin
    @GetMapping(path = "/origin/{name}")
    public ResponseEntity<List<Trip>> getByOrigin(@PathVariable String name) {
        return service.getByOrigin(name);
    }

    @CrossOrigin
    @GetMapping(path = "/destination/{name}")
    public ResponseEntity<List<Trip>> getByDestiny(@PathVariable String name) {

        return service.getByDestiny(name);

    }

    @CrossOrigin
    @GetMapping(path = "/company/{name}")
    public ResponseEntity<List<Trip>> getByAirlines(@PathVariable String name) {

        return service.getByAirlines(name);


    }

    @CrossOrigin
    @GetMapping(path = "/date/{date}")
    public ResponseEntity<List<Trip>> getByDate(@PathVariable LocalDate date) {

        return service.getByDate(date);


    }

    @CrossOrigin
    @GetMapping(path = "/id/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return service.getById(id);
    }
}
