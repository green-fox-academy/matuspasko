package com.greenfox.pixam1_1.repositories;

import com.greenfox.pixam1_1.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
