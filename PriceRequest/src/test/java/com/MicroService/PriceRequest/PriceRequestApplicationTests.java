package com.MicroService.PriceRequest;

import com.MicroService.PriceRequest.Service.PlaceService;
import com.MicroService.PriceRequest.Service.TripService;
import com.MicroService.PriceRequest.models.Place;
import com.MicroService.PriceRequest.models.Trip;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PriceRequestApplicationTests {

	@Autowired
	TripService service;
	@Autowired
	PlaceService placeService;


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

	@Test
	void GetAllOriginsTest(){
		ResponseEntity<List<Place>> resResponse = placeService.getAllPlaces();

		Assert.assertEquals(resResponse.getBody().size(), 5);
	}
	@Test
	void GetTripsByOriginAndDestination_OriginAndDestinationExist_ReturnsOk(){
		ResponseEntity<List<Trip>> res = service.getByOriginAndDestination("Murcia","Valladolid");
		System.out.println(res.getBody());
		Assert.assertEquals(HttpStatus.ACCEPTED,res.getStatusCode());

	}
}
