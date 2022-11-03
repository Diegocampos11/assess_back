package com.Microservice.bookFlight.controllers;



import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.repositories.ReservationRepository;
import com.Microservice.bookFlight.services.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(path = "/api/booking")
public class ReservationController {
    @Autowired
    public ReservationService reservationService;
    public ReservationController(ReservationService reservationService) {
        super();
        this.reservationService = reservationService;
    }
    @PostMapping(path = "/register")
    public ResponseEntity<?> registerBooking(@RequestBody List<Reservation> reservations) {
        for(Reservation reservation : reservations) {
            System.out.println(reservationService.addReservation(reservation));

        }
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
