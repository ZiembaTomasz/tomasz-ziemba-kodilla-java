package com.kodilla.good.patterns.task;

public class HealthyShop implements Service{

    public void process(String provider, int amount, String kind){
        System.out.println("Hello we are " + provider + " and we want to sell " + amount + " pieces of pretty fresh " + kind);
    }
}
