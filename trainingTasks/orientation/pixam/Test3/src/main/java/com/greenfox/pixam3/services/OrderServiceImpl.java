package com.greenfox.pixam3.services;

import com.greenfox.pixam3.models.Order;
import com.greenfox.pixam3.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public Optional<Order> findOrder(Long id) {
        return orderRepo.findById(id);
    }

    @Override
    public List<String> findThreeMostOrderedPizzas() {
        return orderRepo.findThreeMostOrderedPizzas();
    }
}
