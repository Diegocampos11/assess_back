package com.Microservice.bookFlight;

import com.Microservice.bookFlight.pojo.Passenger;
import com.Microservice.bookFlight.models.Reservation;
import com.Microservice.bookFlight.services.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReservationTest {
    @Autowired
    ReservationService reservationService;

//    @Test
//    void RegisterReservation_WhenPassingCorrectData_ReturnsTrue() {
//        List<Passenger> passengerListExample = new ArrayList<Passenger>();
//        passengerListExample.add(
//                new Passenger(
//                        1,
//                        "name",
//                        "surname",
//                        "nationality",
//                        "identification",
//                        LocalDate.now(),
//                        false
//                )
//        );
//        Reservation reservationExample = new Reservation(1, 1, 60, passengerListExample);
//        Reservation reservationReturned = reservationService.addReservation(new Reservation(1, 1, 60, passengerListExample));
//        assertEquals(reservationExample.toString(), reservationReturned.toString());
//    }

    @Test
    void calculateAge_WhenPassingCorrectData_ReturnsInt() {
        LocalDate localDateExampleFlightDate = LocalDate.parse("2002-01-01");
        LocalDate localDateExampleBirthdate = LocalDate.parse("2000-01-01");
        int age = reservationService.calculateAge(localDateExampleFlightDate, localDateExampleBirthdate);
        assertEquals(2, age);
    }

    @Test
    void calculateBaggageFeeTest(){
        List<Passenger> passangers = Arrays.asList(new Passenger(7, "Juan", "Sánchez", "Spain", "44444444H", (LocalDate.parse("2002-11-11")), true),new Passenger(9, "Pepe", "Juárez", "Spain", "44344794H", (LocalDate.parse("2009-01-01")), true));
        Integer resResponse = reservationService.calculateBaggageFee(passangers);

        assertEquals(resResponse, 2*20);
    }

    @Test
    void calculateAgeTest() {

        Integer resResponse = reservationService.calculateAge(LocalDate.parse("2022-11-03"),LocalDate.parse("2005-11-03") );
        assertEquals(resResponse, 17);

    }
}
