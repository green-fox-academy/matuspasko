package com.greenfox.pixam3.services;

import com.greenfox.pixam3.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void saveOrder(Order order);

    Optional<Order> findOrder(Long id);

    List<String> findThreeMostOrderedPizzas();
}

