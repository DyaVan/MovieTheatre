package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.dao.TicketDAO;
import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.entities.Ticket;
import com.diachuk.movietheatre.entities.User;
import com.diachuk.movietheatre.services.interfsces.IBookingService;
import com.diachuk.movietheatre.services.interfsces.IDiscountService;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class BookingService implements IBookingService {

    private IDiscountService discountService;

    @Override
    public double getTicketsPrice(Event event, LocalDateTime dateTime, User user, Set<Long> seats) {
        return event.getBasePrice() * (100-discountService.getDiscount(user,event,dateTime,seats.size()))/100;
    }

    @Override
    public void bookTickets( Set<Ticket> tickets) {
        TicketDAO.getInstance().insertTickets(tickets);
    }

    @Override
    public Set<Ticket> getPurchasedTicketsForEvent(Event event, LocalDateTime dateTime) {
        return null;
    }
}
