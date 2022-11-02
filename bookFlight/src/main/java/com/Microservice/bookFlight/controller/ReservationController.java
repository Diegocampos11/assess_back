package com.Microservice.bookFlight.controller;



import com.Microservice.bookFlight.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/booking")
public class ReservationController {

//    public PriceRequestRepository repository;
//
//    public ReservationController(PriceRequestRepository repository) {
//        super();
//        this.repository = repository;
//    }
    @PostMapping(path = "/register")
    public void registerBooking(@RequestBody List<Reservation> reservations) {
        System.out.println(reservations);
        System.out.println("TO DO!");
    }
}
