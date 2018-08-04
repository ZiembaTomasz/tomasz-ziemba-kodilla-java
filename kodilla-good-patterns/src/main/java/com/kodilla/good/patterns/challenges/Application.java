package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String [] args){
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        ProductOrderService rentalProcessor = new ProductOrderService(new MailService(), new ProductRentalService(), new ProductRentalRepository());
        rentalProcessor.process(rentRequest);
        System.out.println(rentRequest);
    }
}
