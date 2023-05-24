package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID beerId);
}
