package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew(){
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("sesame")
                .burgers(5)
                .sauce("sweet chilli")
                .ingredient("onion")
                .ingredient("pickles")
                .ingredient("garlic")
                .ingredient("extra cabanero sauce")
                .ingredient("jalapeno pepper")
                .ingredient("cheddar cheese")
                .build();
        System.out.println(bigMac);

        int howManyIngredients = bigMac.getIngredients().size();

        Assert.assertEquals(6, howManyIngredients);
    }
}
