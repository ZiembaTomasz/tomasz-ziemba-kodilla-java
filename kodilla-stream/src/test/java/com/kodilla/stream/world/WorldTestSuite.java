package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeople(){
        //Given
        List<Continent>earth = new ArrayList<>();

        Country uganda = new Country(new BigDecimal(15));
        Country kongo = new Country(new BigDecimal(50));
        Country japan = new Country(new BigDecimal(10));
        Country china = new Country(new BigDecimal(15));

        ArrayList<Country>africanCountries = new ArrayList<>();
        ArrayList<Country>asianCountries = new ArrayList<>();

        Continent africa = new Continent(africanCountries);
        Continent asia = new Continent(asianCountries);

        africanCountries.add(uganda);
        africanCountries.add(kongo);
        asianCountries.add(japan);
        asianCountries.add(china);
        earth.add(africa);
        earth.add(asia);

        //When
        World world = new World(earth);
        BigDecimal result = world.getPeople();

        //Then

        BigDecimal liczba = new BigDecimal(90);

        Assert.assertEquals(liczba, result);
    }
}
