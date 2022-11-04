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
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PriceRequestApplicationTests {

	@Autowired
	TripService service;
	@Autowired
	PlaceService placeService;


	@Test
	void GetAllTrips_Expect16Trips_ReturnsOK() {
		ResponseEntity<List<Trip>> tripsResponse = service.getAll();

		Assert.assertEquals(16, tripsResponse.getBody().size());
	}

	@Test
	void GetByOrigin_ExpectTripsWithOriginValladolid_ReturnsOK() {
		ResponseEntity<List<Trip>> resResponse = service.getByOrigin("Valladolid");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals("Valladolid", trip.getOrigin().getName());
		}
	}

	@Test
	void GetByDestiny_ExpectTripsWithDestinationValladolid_ReturnsOK() {
		ResponseEntity<List<Trip>> resResponse = service.getByDestiny("Valladolid");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals("Valladolid", trip.getDestination().getName());
		}
	}

	@Test
	void GetByAirLines_ExpectTripsByRyanair_ReturnsOK() {
		ResponseEntity<List<Trip>> resResponse = service.getByAirlines("Ryanair");

		for (Trip trip : resResponse.getBody())
		{
			Assert.assertEquals("Ryanair", trip.getCompany());
		}
	}

	@Test
	void GetByDate_ExpectTripsIn2022Jan01_ReturnsERROR() {
		ResponseEntity<List<Trip>> resResponse = service.getByDateTime(LocalDateTime.parse("2022-01-01"));

		for (Trip trip : resResponse.getBody()) {
			Assert.assertEquals(LocalDate.parse("2022-01-01"), trip.getDateTime());

		}
	}

	@Test
	void GetById_ExpectTripWithId2_ReturnsERROR() {
		ResponseEntity<?> resResponse = service.getById(2);
		Trip trip = (Trip) resResponse.getBody();
		Assert.assertEquals(2, trip.getId());
	}

	@Test
	void GetAllOrigins_ExpectListOfAllPlaces_ReturnsOK(){
		ResponseEntity<List<Place>> resResponse = placeService.getAllPlaces();

		Assert.assertEquals(5, resResponse.getBody().size());
	}
	@Test
	void GetTripsByOriginAndDestination_ExpectOriginAndDestinationExist_ReturnsOK(){
		ResponseEntity<List<Trip>> res = service.getByOriginAndDestination("Murcia","Valladolid");
		System.out.println(res.getBody());
		Assert.assertEquals(HttpStatus.ACCEPTED,res.getStatusCode());
	}
}
