package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.dao.UserDAO;
import com.diachuk.movietheatre.entities.User;
import com.diachuk.movietheatre.services.interfsces.IUserService;

import java.util.Collection;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class UserService implements IUserService {
    @Override
    public User getUserByEmail(String email) {
        return UserDAO.getInstance().getByEmail(email);
    }

    @Override
    public User save(User user) {
        if (!UserDAO.getInstance().exists(user)) {
            return UserDAO.getInstance().insert(user);
        }
        return null;
    }

    @Override
    public void remove(User user) {
        UserDAO.getInstance().delete(user);
    }

    @Override
    public User getById(Long id) {
       return UserDAO.getInstance().getById(id);
    }

    @Override
    public Collection<User> getAll() {
        return UserDAO.getInstance().getAll();
    }
}
