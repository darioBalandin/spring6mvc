package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.Beer;

import java.time.LocalDateTime;
import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder()
                .id(beerId)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc("dfs")
                .price(12.99)
                .quantityOnHand(200)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
