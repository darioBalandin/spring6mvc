package dario.springframework.spring6restmvc.controllers;

import dario.springframework.spring6restmvc.model.Beer;
import dario.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {

    private final BeerService beerService;

    @PostMapping
    public ResponseEntity<Beer> handlePost(@RequestBody Beer beer) {
        Beer savedBeer = beerService.saveNewBeer(beer);

        return new ResponseEntity<Beer>(savedBeer,HttpStatus.CREATED);
    }


    @GetMapping()
    public List<Beer> listBeers() {
        log.debug("listBeers is called in the controller 123445689");

        return beerService.listBeers();
    }

    @GetMapping("/{beerId}")
    public Beer getBeerById(@PathVariable UUID beerId) {
        log.debug("getBeerById is called in the controller");

        return beerService.getBeerById(beerId);
    }
}
