package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.entities.Ticket;
import com.diachuk.movietheatre.entities.User;
import com.diachuk.movietheatre.services.interfsces.IBookingService;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class BookingService implements IBookingService {
    @Override
    public double getTicketsPrice(Event event, LocalDateTime dateTime, User user, Set<Long> seats) {
        new Event()..
        return 0;
    }

    @Override
    public void bookTickets(Set<Ticket> tickets) {

    }

    @Override
    public Set<Ticket> getPurchasedTicketsForEvent(Event event, LocalDateTime dateTime) {
        return null;
    }
}
