package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.entities.Auditorium;
import com.diachuk.movietheatre.services.interfsces.IAuditoriumService;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class AuditoriumService implements IAuditoriumService {

    private HashMap<String, Auditorium> auditoriums = new HashMap<>();

    @Override
    public Set<Auditorium> getAll() {
        return auditoriums.entrySet()
                .stream()
                .map(java.util.Map.Entry::getValue)
                .collect(Collectors.toSet());
    }

    @Override
    public Auditorium getByName(String name) {
        return auditoriums.get(name);
    }
}
