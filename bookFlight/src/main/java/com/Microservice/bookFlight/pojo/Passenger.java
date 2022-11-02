package com.Microservice.bookFlight.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Autowired
    private String name;
    @Autowired
    private String surname;
    @Autowired
    private String nationality;
    @Autowired
    private String birthdate;
    @Autowired
    private boolean needLuggage;
    @Override
    public String toString() {
        return "Passenger{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthdate=" + birthdate +
                ", needLuggage=" + needLuggage +
                '}';
    }
}
