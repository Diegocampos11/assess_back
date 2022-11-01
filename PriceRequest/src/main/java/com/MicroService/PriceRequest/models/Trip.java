package com.MicroService.PriceRequest.models;

import com.MicroService.PriceRequest.models.Enums.Companies;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;

    private Enum<Companies> Company;

    @ManyToOne(fetch = FetchType.EAGER)
    private Place place_origin_id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Place place_destination_id;
    @Column
    private boolean luggage_allowance;
    @Column
    private LocalDate date;
    @Column
    private int price;

}

	
	

