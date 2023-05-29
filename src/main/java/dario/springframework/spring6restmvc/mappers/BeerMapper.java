package dario.springframework.spring6restmvc.mappers;


import dario.springframework.spring6restmvc.entities.Beer;
import dario.springframework.spring6restmvc.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDto(Beer beer);
}
