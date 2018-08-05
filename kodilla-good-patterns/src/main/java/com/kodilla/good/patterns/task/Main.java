package com.kodilla.good.patterns.task;

public class Main {

    public static void main(String [] args){
        Processing processing = new Processing(new ExtraFoodShop());
        processing.adding();
        System.out.println();
        Processing processing1 = new Processing(new GlutenFreeShop());
        processing1.adding();
        System.out.println();
        Processing processing2 = new Processing(new HealthyShop());
        processing2.adding();
    }
}
