package com.flightApp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
		return builder.routes()
				.route("getplaces", r -> r.path("/api/places/all")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/trips/all")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/trips/origin/{name}")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/trips/destination/{name}")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/trips/itinerary/from/{origin}/to/{destination}")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/trips/id/{id}")
						.uri("http://localhost:8080/"))
				.route("getplaces", r -> r.path("/api/booking/register")
						.uri("http://localhost:8081/"))
				.build();
	}
}
