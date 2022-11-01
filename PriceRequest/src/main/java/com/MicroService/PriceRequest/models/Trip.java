package com.MicroService.PriceRequest.models;

import com.MicroService.PriceRequest.models.Enums.Companies;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String company;

    @ManyToOne(fetch = FetchType.EAGER)
    private Place origin;

    @ManyToOne(fetch = FetchType.EAGER)
    private Place destination;
    @Column
    private boolean luggage;
    @Column
    private LocalDate date;
    @Column
    private int price;

}

	
	

