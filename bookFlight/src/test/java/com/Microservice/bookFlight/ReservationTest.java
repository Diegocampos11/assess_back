package com.Microservice.bookFlight;

import com.Microservice.bookFlight.pojo.Passenger;
import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.services.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReservationTest {
    @Autowired
    ReservationService reservationService;

    @Test
    void RegisterReservation_WhenPassingCorrectData_ReturnsTrue() {
        List<Passenger> passengerListExample = new ArrayList<Passenger>();
        passengerListExample.add(
                new Passenger(
                        null,
                        "name",
                        "surname",
                        "nationality",
                        "birthdate",
                        false
                )
        );
        Reservation reservationExample = new Reservation(1, 1, passengerListExample);
        int idReservation = reservationService.addReservation(reservationExample);
        assertEquals(reservationExample.toString(), reservationService.getReservation(idReservation).toString());
    }
}
