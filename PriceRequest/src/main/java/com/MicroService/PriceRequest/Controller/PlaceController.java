package com.MicroService.PriceRequest.Controller;

import com.MicroService.PriceRequest.models.Place;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/places")
public class PlaceController {




    @GetMapping("/all")
    public List<Place> getAllOrigins(){
        return null;
    }

}
