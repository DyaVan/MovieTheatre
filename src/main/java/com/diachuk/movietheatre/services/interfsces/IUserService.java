package com.diachuk.movietheatre.services.interfsces;

import com.diachuk.movietheatre.entities.User;

public interface IUserService extends IAbstractDomainObjectService<User> {

    /**
     * Finding user by email
     * 
     * @param email
     *            Email of the user
     * @return found user or <code>null</code>
     */
    public User getUserByEmail(String email);

}
