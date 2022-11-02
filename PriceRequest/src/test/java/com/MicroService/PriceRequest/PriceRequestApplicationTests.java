package com.MicroService.PriceRequest;

import com.MicroService.PriceRequest.Controller.PriceRequestController;
import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class PriceRequestApplicationTests {

	@Autowired
	PriceRequestController controller ;

	@Test
	void getByCompanyName_CompanyNameExist_ReturnsOK() {
		ResponseEntity<List<Trip>>res = controller.getByAirlines("Ryanair");
		System.out.println(res.getBody());
		Assert.assertEquals(HttpStatus.ACCEPTED, res.getStatusCode());

	}

}
