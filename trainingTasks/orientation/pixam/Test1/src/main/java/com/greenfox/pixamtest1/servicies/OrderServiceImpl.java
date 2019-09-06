package com.greenfox.pixamtest1.servicies;

import com.greenfox.pixamtest1.models.Order;
import com.greenfox.pixamtest1.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Order> findOrder(long id) {
        return orderRepo.findById(id);
    }

    @Override
    public List<String> findThreeMostOrderedPizzas() {
        return orderRepo.findThreeMostOrderedPizzas();
    }


}
