package one.digitalinnovation.beerstock.exception;

import one.digitalinnovation.beerstock.entity.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLowerThanDecrementException extends Exception{

    public BeerStockLowerThanDecrementException(Beer beer, int quantityToDecrement) {
        super(String.format("Unable to decrement %s units of beer with Id %d. Currently inventory = %d",
                quantityToDecrement,
                beer.getId(),
                beer.getQuantity()));
    }

}
