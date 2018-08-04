package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String [] args){
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(), new ProductRentalService(), new ProductRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
