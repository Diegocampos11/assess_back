package com.Microservice.bookFlight.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
