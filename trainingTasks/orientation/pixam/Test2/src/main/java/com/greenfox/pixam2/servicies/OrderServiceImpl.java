package com.greenfox.pixam2.servicies;

import com.greenfox.pixam2.models.Order;
import com.greenfox.pixam2.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepo orderRepo;

    @Autowired
    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }
}
