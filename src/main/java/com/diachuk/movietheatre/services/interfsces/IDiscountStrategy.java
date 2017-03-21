package com.diachuk.movietheatre.services.interfsces;

import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.entities.User;

import java.time.LocalDateTime;
import java.util.function.Consumer;

/**
 * Created by Ivan_Diachuk on 3/21/2017.
 */
public interface IDiscountStrategy {

    byte discount(User user, Event event, LocalDateTime airDateTime, long numberOfTickets);

}
