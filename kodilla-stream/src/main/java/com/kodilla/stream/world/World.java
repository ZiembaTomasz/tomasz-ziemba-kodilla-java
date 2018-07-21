package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeople() {
        return continents.stream()
                .map(continent -> continent.getCountries())
                .flatMap(countryList -> countryList.stream())
                .map(country -> country.getPeople())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
