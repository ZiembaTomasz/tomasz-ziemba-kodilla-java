package com.kodilla.exception.test;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight("London", "Madrid");
        Logic logic = new Logic();

        try{
            logic.findFilght(flight);
        }catch(RouteNotFoundException e) {
            System.out.println("Error founded");
        }finally{
            System.out.println(":)");
        }
    }
}