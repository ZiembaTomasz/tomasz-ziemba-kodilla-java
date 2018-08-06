package com.kodilla.good.patterns.Airport;


import java.util.Objects;

public class Airport {
    private String arrival;
    private String change;
    private String departure;

    public Airport(String arrival, String change, String departure) {
        this.arrival = arrival;
        this.change = change;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getChange() {
        return change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(arrival, airport.arrival) &&
                Objects.equals(departure, airport.departure) &&
                Objects.equals(change, airport.change);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrival, departure, change);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "arrival='" + arrival + '\'' +
                ", change='" + change + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
