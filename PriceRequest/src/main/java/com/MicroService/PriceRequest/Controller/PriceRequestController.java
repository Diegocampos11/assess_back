package com.MicroService.PriceRequest.Controller;


import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
import com.MicroService.PriceRequest.models.Trip;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "/origin={name}")
    public ResponseEntity<List<Trip>> getByOrigin(@PathVariable String name) {

        List<Trip> res = repository.findByOrigin_name(name);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);

    }
    @GetMapping(path = "/company={name}")
    public ResponseEntity<List<Trip>> getByAirlines(@PathVariable String name) {

        List<Trip> res = repository.findByCompany(name);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);


    }
    @GetMapping(path = "/id={id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        Optional<Trip> res = repository.findById(id);
    if(res.isEmpty()){
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    } else {
       return  new ResponseEntity<>(res, HttpStatus.ACCEPTED);
     }
    }
}
