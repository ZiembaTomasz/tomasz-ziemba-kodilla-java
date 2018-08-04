package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequestRetriever {
    public RentRequest retrieve(){
        User user = new User("Jacek", "Pomianek");

        LocalDateTime rentFrom = LocalDateTime.of(2018, 6, 15, 12, 7 );
        LocalDateTime rentTo = LocalDateTime.of(2018, 7, 15, 12, 7);
        return new RentRequest(user, rentFrom, rentTo);

    }

}
