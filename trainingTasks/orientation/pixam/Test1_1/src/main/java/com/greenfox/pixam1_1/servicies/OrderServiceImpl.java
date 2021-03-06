package com.greenfox.pixam1_1.servicies;

import com.greenfox.pixam1_1.models.Order;
import com.greenfox.pixam1_1.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }


    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }

    @Override
    public Optional<Order> findOrder(long id) {
        return orderRepo.findById(id);
    }
}
