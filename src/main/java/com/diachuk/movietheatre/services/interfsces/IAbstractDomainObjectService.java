package com.diachuk.movietheatre.services.interfsces;

import com.diachuk.movietheatre.entities.DomainObject;

import java.util.Collection;

public interface IAbstractDomainObjectService<T extends DomainObject> {

    /**
     * Saving new object to storage or updating existing one
     * 
     * @param object
     *            Object to save
     * @return saved object with assigned id
     */
    public T save( T object);

    /**
     * Removing object from storage
     * 
     * @param object
     *            Object to delete
     */
    public void remove( T object);

    /**
     * Getting object by id from storage
     * 
     * @param id
     *            id of the object
     * @return Found object or <code>null</code>
     */
    public T getById( Long id);

    /**
     * Getting all objects from storage
     * 
     * @return collection of objects
     */
    public Collection<T> getAll();
}
