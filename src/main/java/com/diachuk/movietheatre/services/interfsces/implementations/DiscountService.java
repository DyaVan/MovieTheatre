package com.diachuk.movietheatre.services.interfsces.implementations;

import com.diachuk.movietheatre.services.interfsces.IDiscountStrategy;
import com.diachuk.movietheatre.entities.Event;
import com.diachuk.movietheatre.entities.User;
import com.diachuk.movietheatre.services.interfsces.IDiscountService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan_Diachuk on 3/21/2017.
 */
public class DiscountService implements IDiscountService {

    private List<IDiscountStrategy> discountStrategies = new ArrayList<>();

    @Override
    public byte getDiscount(User user, Event event, LocalDateTime airDateTime, long numberOfTickets) {
        byte maxDiscount = 0;
        for (IDiscountStrategy ds : discountStrategies) {
            byte discount = ds.discount(user,event,airDateTime,numberOfTickets);
            if ( discount > maxDiscount) {
                maxDiscount = discount;
            }
        }
        return maxDiscount;
    }
}
