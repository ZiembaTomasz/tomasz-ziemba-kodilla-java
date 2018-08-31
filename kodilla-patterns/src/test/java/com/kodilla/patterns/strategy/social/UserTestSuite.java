package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        User george = new Millenials("George Malkovich");
        User wilhelm = new YGeneration("Wilhelm Simba");
        User vendetta = new ZGeneration("Vendetta Vax");

        String georgeLike = george.sharePost();
        System.out.println("George shares on " + georgeLike);
        String wilhelmLike = wilhelm.sharePost();
        System.out.println("Wilhelm shares on " + wilhelmLike);
        String vendettaLike = vendetta.sharePost();
        System.out.println("Vendetta shares on " + vendettaLike);

        Assert.assertEquals("Facebook!!!", georgeLike);
        Assert.assertEquals("Twitter!!!", wilhelmLike);
        Assert.assertEquals("Snapchat!!!", vendettaLike);
    }
    @Test
    public void testIndividualSharingStrategy(){
        User george = new Millenials("George Malkovich");

        String georgeLike = george.sharePost();
        System.out.println("George shares on  " + georgeLike);
        george.setSocialPublisher(new FacebookPublisher());
        georgeLike = george.sharePost();
        System.out.println("George shares on " + georgeLike);

        Assert.assertEquals("Facebook!!!", georgeLike);
    }
}
