package com.MicroService.PriceRequest.Controller;


import com.MicroService.PriceRequest.Service.TripService;
import com.MicroService.PriceRequest.models.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/trips")
public class TripController {

    @Autowired
    private TripService service;

    public TripController(TripService service) {
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

    @CrossOrigin
    @GetMapping(path = "/itinerary/from/{origin}/to/{destination}")
    public ResponseEntity<List<Trip>> getItinerary(@PathVariable String origin,
                                                   @PathVariable String destination){

        return service.getByOriginAndDestination(StringUtils.capitalize(origin),StringUtils.capitalize(destination));
    }
}
