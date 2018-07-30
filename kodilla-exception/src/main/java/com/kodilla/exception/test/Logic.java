package com.kodilla.exception.test;

import java.util.HashMap;

public class Logic {

    public void findFilght(Flight flight)throws RouteNotFoundException{
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("New York", true);
        flights.put("Boleslawiec", false);
        flights.put("Gaszyn", false);
        flights.put("Moskwa", true);
        if(flights.containsKey(flight.getArrivalAirport())){
            if(flights.get(flight.getArrivalAirport())) {
                System.out.println("jazda");
            }
        }
        else{
            throw new RouteNotFoundException();
        }

    }
}
