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
    @ManyToOne(fetch = FetchType.EAGER)
    private Place origin;
    @ManyToOne(fetch = FetchType.EAGER)
    private Place destination;
    @Column
    private boolean luggage_allowance;
    @Column
    private LocalDateTime dateTime;
    @Column
    private int price;

}

	
	

