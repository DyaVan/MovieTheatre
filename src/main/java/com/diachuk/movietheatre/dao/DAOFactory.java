package com.diachuk.movietheatre.dao;

/**
 * Created by Ivan_Diachuk on 3/20/2017.
 */
public class DAOFactory {
    private static DAOFactory ourInstance = new DAOFactory();

    public static DAOFactory getInstance() {
        return ourInstance;
    }

    private DAOFactory() {
    }
}
