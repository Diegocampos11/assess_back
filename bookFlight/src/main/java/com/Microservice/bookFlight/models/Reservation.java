package com.Microservice.bookFlight.models;

import com.Microservice.bookFlight.pojo.Passenger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(fetch = FetchType.EAGER)
    private Trip id_flight;
    @Column
    private double price;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Passenger> passengers;
    @Override
    public String toString() {
        return "Reservation{" +
                "id_flight=" + id_flight +
                "price=" + price +
                ", passengers=" + passengers +
                '}';
    }
}
