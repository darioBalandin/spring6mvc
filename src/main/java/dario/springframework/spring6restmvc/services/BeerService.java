package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();
    Beer getBeerById(UUID beerId);

    Beer saveNewBeer(Beer beer);
}
