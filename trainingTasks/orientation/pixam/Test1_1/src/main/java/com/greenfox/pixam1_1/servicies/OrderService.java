package com.greenfox.pixam1_1.servicies;

import com.greenfox.pixam1_1.models.Order;

import java.util.Optional;

public interface OrderService {

    void saveOrder(Order order);

    Optional<Order> findOrder(long id);
}
