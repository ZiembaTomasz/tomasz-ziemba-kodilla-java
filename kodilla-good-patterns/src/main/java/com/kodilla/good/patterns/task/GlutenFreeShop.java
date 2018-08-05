package com.kodilla.good.patterns.task;

public class GlutenFreeShop implements Service{

    public void process(String provider, int amount, String kind){
        System.out.println("Our shop " + provider + " have " + amount + kind);
    }
}
