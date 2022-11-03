package com.Microservice.bookFlight.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String Company;
    @Column
    private int place_origin_id;
    @Column
    private int place_destination_id;
    @Column
    private boolean luggage_allowance;
    @Column
    private LocalDate dateTime;

}

	
	

