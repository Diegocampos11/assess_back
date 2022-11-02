package com.Microservice.bookFlight.models;

import com.Microservice.bookFlight.models.Passenger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Autowired
    private int id_flight;
    @Autowired
    private List<Passenger> passengers;
    @Override
    public String toString() {
        return "Reservation{" +
                "id_flight=" + id_flight +
                ", passengers=" + passengers +
                '}';
    }
}
