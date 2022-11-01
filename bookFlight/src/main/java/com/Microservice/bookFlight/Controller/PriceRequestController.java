package com.Microservice.bookFlight.Controller;



import com.Microservice.bookFlight.Repositories.PriceRequestRepository;
import com.Microservice.bookFlight.models.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/trips")
public class PriceRequestController {

    public PriceRequestRepository repository;

    public PriceRequestController(PriceRequestRepository repository) {
        super();
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping (path = "/test")
    public Trip test() {
        repository.save(new Trip());
        return new Trip();

    }
    @GetMapping(path = "/price")

    public void getPrice() {
    }
}
