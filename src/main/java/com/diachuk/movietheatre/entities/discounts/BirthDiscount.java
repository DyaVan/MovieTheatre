package com.diachuk.movietheatre.entities.discounts;

import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.entities.User;
import com.diachuk.movietheatre.services.interfsces.IDiscountStrategy;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Ivan_Diachuk on 3/21/2017.
 */
public class BirthDiscount implements IDiscountStrategy {

    @Override
    public byte discount(User user, Event event, LocalDateTime airDateTime, long numberOfTickets) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = user.getBirthDate();
        if (birthDate.getMonth() == today.getMonth() && birthDate.getDayOfMonth() == today.getDayOfMonth()) {
            return 5;
        }
        return 0;
    }
}
