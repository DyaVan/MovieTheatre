package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.dao.EventDAO;
import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.services.interfsces.IEventService;

import java.util.Collection;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class EventService implements IEventService {
    @Override
    public Event getByName(String name) {
        return EventDAO.getInstance().getByName(name);
    }

    @Override
    public Event save(Event event) {
        return EventDAO.getInstance().insert(event);
    }

    @Override
    public void remove(Event event) {
        EventDAO.getInstance().delete(event);
    }

    @Override
    public Event getById(Long id) {
        return EventDAO.getInstance().getById(id);
    }

    @Override
    public Collection<Event> getAll() {
        return EventDAO.getInstance().getAll();
    }
}
