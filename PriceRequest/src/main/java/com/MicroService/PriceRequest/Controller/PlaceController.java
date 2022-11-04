package com.MicroService.PriceRequest.Controller;

import com.MicroService.PriceRequest.Service.PlaceService;
import com.MicroService.PriceRequest.models.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/places")
public class PlaceController {

    @Autowired
    private PlaceService service;

    public PlaceController(PlaceService service) {
        super();
        this.service = service;
    }
    @CrossOrigin
    @GetMapping("/all")
    public ResponseEntity<List<Place>> getAllOrigins(){
        return service.getAllPlaces();
    }

}
