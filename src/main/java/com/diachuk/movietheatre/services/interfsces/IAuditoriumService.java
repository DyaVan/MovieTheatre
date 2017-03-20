package com.diachuk.movietheatre.services.interfsces;

import com.diachuk.movietheatre.entities.Auditorium;

import java.util.*;

public interface IAuditoriumService {


    /**
     * Getting all auditoriums from the system
     * 
     * @return set of all auditoriums
     */
    public  Set<Auditorium> getAll();

    /**
     * Finding auditorium by name
     * 
     * @param name
     *            Name of the auditorium
     * @return found auditorium or <code>null</code>
     */
    public  Auditorium getByName(String name);

}
