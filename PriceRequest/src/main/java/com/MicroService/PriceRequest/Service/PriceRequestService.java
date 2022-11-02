package com.MicroService.PriceRequest.Service;

import com.MicroService.PriceRequest.Repositories.PriceRequestRepository;
import com.MicroService.PriceRequest.models.Trip;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PriceRequestService {
    public PriceRequestRepository repository;

    public PriceRequestService(PriceRequestRepository repository) {
        super();
        this.repository = repository;
    }

    public ResponseEntity<List<Trip>> getAll() {
        List<Trip> trips = repository.findAll();

        return new ResponseEntity<>(trips, HttpStatus.ACCEPTED);

    }

    public ResponseEntity<List<Trip>> getByOrigin(String name) {

        List<Trip> res = repository.findByOrigin_name(name);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);

    }

    public ResponseEntity<List<Trip>> getByDestiny(String name) {

        List<Trip> res = repository.findByDestination_name(name);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);

    }

    public ResponseEntity<List<Trip>> getByAirlines(String name) {

        List<Trip> res = repository.findByCompany(name);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);

    }

    public ResponseEntity<List<Trip>> getByDate(LocalDate date) {

        List<Trip> res = repository.findByDate(date);
        return new ResponseEntity<>(res, HttpStatus.ACCEPTED);


    }

    public ResponseEntity<?> getById(int id) {
        Optional<Trip> res = repository.findById(id);
        if (res.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
        }
    }
}
