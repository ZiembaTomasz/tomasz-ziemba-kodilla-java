package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        World world = new World();
        List<Continent> africa = new ArrayList<>();
        africa.add(new Country("1000000", "Uganda"));
        africa.add(new Country("1000000", "Kongo"));

        Assert.assertEquals(2000000, world.getPoepleQuantity());
    }
}
