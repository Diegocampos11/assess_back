package com.Microservice.bookFlight;

import com.Microservice.bookFlight.models.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReservationTest {

	@Autowired
	ReservationService reservationService;

	@Test
	void RegisterReservation_WhenPassingCorrectData_ReturnsTrue() {
		Reservation reservationExample = new Reservation();
		int id_reservation = reservationService.registerReservation(new ArrayList<Reservation>().add(reservationExample));
		assertEquals(reservationExample.toString(), reservationService.getReservation(id_reservation).toString());
	}
}
