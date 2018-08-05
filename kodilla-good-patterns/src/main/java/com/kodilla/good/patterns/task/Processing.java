package com.kodilla.good.patterns.task;

public class Processing {
    Service service;

    public Processing(Service service) {
        this.service = service;
    }
    public void adding(){
        System.out.println("We are adding new company");
        this.service.process();
    }

}
