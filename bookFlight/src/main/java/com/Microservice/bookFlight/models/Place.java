package com.Microservice.bookFlight.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Place {

    @Column
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String img_url;


}
