package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal people;

    public Country(BigDecimal people) {
        this.people = people;
    }

    public BigDecimal getPeople() {
        return people;
    }
}