package com.diachuk.movietheatre.dao;

import com.diachuk.movietheatre.entities.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class EventDAO {

    private Long idCounter = 1L;

    private static EventDAO ourInstance = new EventDAO();

    public static EventDAO getInstance() {
        return ourInstance;
    }

    private EventDAO() {
    }

    private HashMap<String, Event> events = new HashMap<>();


    public Event getByName(String name) {
        return events.get(name);
    }

    public Event insert(Event event) {
        event.setId(idCounter++);
        events.put(event.getName(), event);
        return event;
    }

    public void delete(Event event) {
        events.remove(event.getName());
    }

    public Event getById(Long id) {
        return events.values().stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public Collection<Event> getAll() {
        return events.values();
    }
}
