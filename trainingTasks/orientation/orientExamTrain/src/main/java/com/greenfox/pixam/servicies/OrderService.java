package com.greenfox.pixam.servicies;

import com.greenfox.pixam.models.Order;

import java.util.Optional;

public interface OrderService {

    void saveOrder(Order order);

    Optional<Order> findOrder(long id);


}

