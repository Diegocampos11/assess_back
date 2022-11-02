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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private int idFlight;
    @Column
    @OneToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Passenger> passengers;
    @Override
    public String toString() {
        return "Reservation{" +
                "id_flight=" + idFlight +
                ", passengers=" + passengers +
                '}';
    }
}
