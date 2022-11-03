package com.MicroService.PriceRequest;

import com.MicroService.PriceRequest.Controller.PriceRequestController;
import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
import com.MicroService.PriceRequest.Service.PriceRequestService;
import com.MicroService.PriceRequest.models.Trip;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PriceRequestApplicationTests {



	@Autowired
	PriceRequestService service;

	@Test
	void checkGetAllTrips() {
		ResponseEntity<List<Trip>> tripsResponse = service.getAll();

		Assert.assertEquals(tripsResponse.getBody().size(), 16);
	}

	@Test
	void checkGetByOrigin() {
		ResponseEntity<List<Trip>> resResponse = service.getByOrigin("Valladolid");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals(trip.getOrigin().getName(), "Valladolid");
		}
	}

	@Test
	void checkGetByDestiny() {
		ResponseEntity<List<Trip>> resResponse = service.getByDestiny("Valladolid");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals(trip.getDestination().getName(), "Valladolid");
		}
	}

	@Test
	void checkGetByAirLines() {
		ResponseEntity<List<Trip>> resResponse = service.getByAirlines("Ryanair");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals(trip.getCompany(), "Ryanair");
		}
	}

	@Test
	void checkGetByDate() {
		ResponseEntity<List<Trip>> resResponse = service.getByDate(LocalDate.parse("2022-01-01"));

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals(trip.getDate(), LocalDate.parse("2022-01-01"));
		}
	}

	@Test
	void checkGetById() {
		ResponseEntity<?> resResponse = service.getById(2);
		Trip trip = (Trip) resResponse.getBody();
		Assert.assertEquals(trip.getId(), 2 );
	}



}
