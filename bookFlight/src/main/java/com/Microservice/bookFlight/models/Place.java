package com.Microservice.bookFlight.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Place {

    @Column
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;



}
