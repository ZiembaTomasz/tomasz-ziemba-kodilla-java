package com.kodilla.good.patterns.task;

public class ExtraFoodShop implements Service {

    public void process(String provider, int amount, String kind){
        System.out.println("We are " + provider + " and we are ready for selling " + amount + " of " + kind);
    }
}
