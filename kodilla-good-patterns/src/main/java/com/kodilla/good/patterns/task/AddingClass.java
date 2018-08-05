package com.kodilla.good.patterns.task;

public class AddingClass implements Service {

    public void process(String provider, int amount, String kind) {
        System.out.println("We are " + provider + ", we want to sell " + amount + " of " + kind);
    }
}
