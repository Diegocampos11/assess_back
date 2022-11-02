package com.Microservice.bookFlight.services;


import com.Microservice.bookFlight.models.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class ReservationService {

    private static List<Reservation> reservations = new ArrayList<>();
    public Reservation getReservation(int idReservation) {
        Predicate<? super Reservation> predicate = reservation -> reservation.getId().equals(idReservation);
		return reservations.stream().filter(predicate).findFirst().orElse(null);
    }
    public int addReservation(Reservation reservation) {
        reservations.add(reservation);
        return reservation.getId();
    }
}
