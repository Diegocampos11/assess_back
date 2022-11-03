package com.Microservice.bookFlight.repositories;

import com.Microservice.bookFlight.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    Reservation findByid(Integer id);
//    List<Trip> findByOrigin_name(String name);
//    List<Trip> findByDestination_name(String name);
//    List<Trip> findByCompany(String name);
//    List<Trip> findByDate(LocalDate date);

}