package com.Microservice.bookFlight;

import com.Microservice.bookFlight.models.Trip;
import com.Microservice.bookFlight.pojo.Passenger;
import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.services.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReservationTest {
    @Autowired
    ReservationService reservationService;

    @Test
    void calculateAge_WhenPassingCorrectData_ReturnsInt() {
        LocalDate localDateExampleFlightDate = LocalDate.parse("2002-01-01");
        LocalDate localDateExampleBirthdate = LocalDate.parse("2000-01-01");
        int age = reservationService.calculateAge(localDateExampleFlightDate, localDateExampleBirthdate);
        assertEquals(2, age);
    }

    @Test
    void calculateBaggageFee_Expect40for2Passengers_ReturnsOK(){
        List<Passenger> passengers = Arrays.asList(new Passenger(7, "Juan", "Sánchez", "Spain", "44444444H", (LocalDate.parse("2002-11-11")), true),new Passenger(9, "Pepe", "Juárez", "Spain", "44344794H", (LocalDate.parse("2009-01-01")), true));
        Integer resResponse = reservationService.calculateBaggageFee(passengers);

        assertEquals(passengers.size()*20, resResponse);
    }

    @Test
    void calculateAge_Expect17Years_ReturnsOK() {

        Integer resResponse = reservationService.calculateAge(LocalDate.parse("2022-11-03"),LocalDate.parse("2005-11-03") );
        assertEquals(17, resResponse);

    }

//    @Test
//    void calculateReservationPrice_Expect90for2PassengersWithBaggage_ReturnsOK() {
//        List<Passenger> passengers = Arrays.asList(new Passenger(7, "Juan", "Sánchez", "Spain", "44444444H", (LocalDate.parse("2002-11-11")), true),new Passenger(9, "Pepe", "Juárez", "Spain", "44344794H", (LocalDate.parse("2009-01-01")), true));
//        Trip trip = new Trip(10, "Ryanair", "Valladolid","Madrid", true, LocalDateTime.parse("2022-11-03"), 25);
//        Reservation reservation = new Reservation(5,trip, 25*passengers.size(), passengers);
//        Integer resResponse = reservationService.calculateReservationPrice(reservation);
//        assertEquals(25*passengers.size()+20*passengers.size(), resResponse);
//
//
//    }
}
