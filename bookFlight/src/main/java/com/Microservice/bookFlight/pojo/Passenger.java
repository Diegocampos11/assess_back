package com.Microservice.bookFlight.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String nationality;
    @Column
    private String birthdate;
    @Column
    private boolean needLuggage;
    @Override
    public String toString() {
        return "Passenger{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthdate=" + birthdate +
                ", needLuggage=" + needLuggage +
                '}';
    }
}
