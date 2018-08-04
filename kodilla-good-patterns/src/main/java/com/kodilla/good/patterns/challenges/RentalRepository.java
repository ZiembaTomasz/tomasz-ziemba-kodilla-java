package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental (final User user, final LocalDateTime from, final LocalDateTime to);
}
