package com.kodilla.stream.world;

import java.math.BigDecimal;
public class Country {
    private final BigDecimal amountOfPeople;
    private final String nameOfTheCountry;


    public Country(BigDecimal amountOfPeople, String nameOfTheCountry) {
        this.amountOfPeople = amountOfPeople;
        this.nameOfTheCountry = nameOfTheCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return amountOfPeople;
    }

    public String getNameOfTheCountry() {
        return nameOfTheCountry;
    }
}
