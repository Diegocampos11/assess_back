package com.Microservice.bookFlight.services;


import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.models.Trip;
import com.Microservice.bookFlight.pojo.Passenger;
import com.Microservice.bookFlight.repositories.ReservationRepository;
import com.Microservice.bookFlight.repositories.TripRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    //Repository Instances
    private ReservationRepository reservationRepository;
    private TripRepository tripRepository;
    public ReservationService(ReservationRepository reservationRepository, TripRepository tripRepository) {
        super();
        this.reservationRepository = reservationRepository;
        this.tripRepository = tripRepository;
    }

    public ResponseEntity<?> getById(int id) {
        Optional<Reservation> res = reservationRepository.findById(id);
        if (res.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
        }
    }

    public List<Reservation> addReservation(List<Reservation> reservations) {
        for(Reservation reservation : reservations) {
            reservation.setPrice(calculateReservationPrice(reservation));
        }
        System.out.println(reservations);
        return reservations;
    }
    public int calculateReservationPrice(Reservation reservation){
        Optional<Trip> tripReservation = tripRepository.findById(reservation.getId_flight().getId());
        Trip trip = tripReservation.get();
        int reservationPrice = 0;
        reservationPrice += calculateBaggageFee(reservation.getPassengers());
        for (Passenger passenger : reservation.getPassengers() ) {
            if(calculateAge(reservation.getId_flight().getDateTime(),passenger.getBirthdate())>=2){
                reservationPrice += trip.getPrice();
            }
        }
        return reservationPrice;
    }
    public int calculateBaggageFee(List<Passenger> passengers){
        int finalFee = 0;
        for (Passenger passenger: passengers) {
            if(passenger.isNeedLuggage()){
                finalFee += 20;
            }
        }
        return finalFee;
    }
    public int calculateAge(LocalDate flightDate, LocalDate birthdate) {
        return (int) (flightDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000 - birthdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() / 1000) / 31536000;
    }
}
