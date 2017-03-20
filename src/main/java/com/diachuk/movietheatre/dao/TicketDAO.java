package com.diachuk.movietheatre.dao;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class TicketDAO {
    private static TicketDAO ourInstance = new TicketDAO();

    public static TicketDAO getInstance() {
        return ourInstance;
    }

    private TicketDAO() {
    }
}
