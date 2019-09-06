package com.greenfox.pixamtest1.servicies;

import com.greenfox.pixamtest1.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void saveOrder(Order order);

    Optional<Order> findOrder(long id);

    List<String> findThreeMostOrderedPizzas();
}
