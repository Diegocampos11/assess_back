package com.Microservice.bookFlight;

import com.Microservice.bookFlight.pojo.Passenger;
import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.services.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
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
                        1,
                        "name",
                        "surname",
                        "nationality",
                        LocalDate.now(),
                        false
                )
        );
        Reservation reservationExample = new Reservation(1, 1, 60, passengerListExample);
        Reservation reservationReturned = reservationService.addReservation(new Reservation(1, 1, 60, passengerListExample));
        assertEquals(reservationExample.toString(), reservationReturned.toString());
    }
}
