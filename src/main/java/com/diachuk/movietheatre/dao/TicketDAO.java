package com.diachuk.movietheatre.dao;

import com.diachuk.movietheatre.entities.Ticket;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class TicketDAO {

    private Long idCounter = 1L;

    private HashMap<Long, Ticket> tickets = new HashMap<>();

    private static TicketDAO ourInstance = new TicketDAO();

    public static TicketDAO getInstance() {
        return ourInstance;
    }

    private TicketDAO() {
    }

    public void insertTickets(Set<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            insert(ticket);
        }
    }

    public void insert(Ticket ticket) {
        ticket.setId(idCounter++);
        tickets.put(ticket.getId(), ticket);
    }
}
