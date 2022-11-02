package com.Microservice.bookFlight.services;


import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.repositories.ReservationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ReservationService {

    private ReservationRepository reservationRepository;
    public ReservationService(ReservationRepository reservationRepository) {
        super();
        this.reservationRepository = reservationRepository;
    }

    public ResponseEntity<?> getById(int id) {
        Optional<Reservation> res = reservationRepository.findById(id);
        if (res.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
        }
    }
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
