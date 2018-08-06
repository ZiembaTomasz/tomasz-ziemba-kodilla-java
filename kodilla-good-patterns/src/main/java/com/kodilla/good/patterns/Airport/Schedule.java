package com.kodilla.good.patterns.Airport;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Schedule {


    public  Set<Airport> getList() {

        final HashSet<Airport> list = new HashSet<Airport>();

        list.add(new Airport("New York", "Warsaw", "Moscow"));
        list.add(new Airport("New York", "", "London"));
        list.add(new Airport("Warsaw", "London", "Moscow"));
        list.add(new Airport("Warsaw", "", "London"));
        list.add(new Airport("Moscow", "Warsaw", "New York"));
        return new HashSet<Airport>(list);
    }

    public Set<Airport> flightFrom(String from) {
        return getList().stream()
                .filter(airport -> from.equals(airport.getArrival()))
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }

    public Set<Airport> flightTo(String to) {
        return getList().stream()
                .filter(airport -> to.equals(airport.getDeparture()))
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
    public Set<Airport> findStop(String stop, String finalDestination) {
        return getList().stream()
                .filter(airport -> stop.equals(airport.getChange()) && finalDestination.equals(airport.getDeparture()))
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}


