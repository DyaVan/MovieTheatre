package com.diachuk.movietheatre.dao;

import com.diachuk.movietheatre.entities.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class UserDAO {

    private Long idCounter = 1L;

    private static UserDAO ourInstance = new UserDAO();

    public static UserDAO getInstance() {
        return ourInstance;
    }

    private UserDAO() {
    }

    private HashMap<String, User> users = new HashMap<>();

    public User getByEmail(String email) {
        return users.get(email);
    }

    public User insert(User user) {
        user.setId(idCounter++);
        users.put(user.getEmail(), user);
        return user;
    }

    public boolean exists(User user) {
        if (users.containsKey(user.getEmail())) {
            return true;
        }
        return false;
    }

    public void delete(User user) {
        users.remove(user.getEmail());
    }

    public User getById(Long id) {
        return users.values().stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    public Collection<User> getAll() {
        return users.values();
    }
}
