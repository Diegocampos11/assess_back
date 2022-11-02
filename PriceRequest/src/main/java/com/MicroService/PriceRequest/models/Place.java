package com.MicroService.PriceRequest.models;

import com.MicroService.PriceRequest.models.Enums.CityNames;

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
    @Column
    private String img_url;


}
