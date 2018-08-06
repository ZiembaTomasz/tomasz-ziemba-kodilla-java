package com.kodilla.good.patterns.Airport;

public class App {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        System.out.println("From Warsaw");
        schedule.flightFrom("Warsaw");
        System.out.println("To Moscow");
        schedule.flightTo("Moscow");
        System.out.println("Stop(Warsaw) and Final Destination (Moscow)");
        schedule.findStop("Warsaw", "Moscow");
    }
}
