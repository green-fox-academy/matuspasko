package com.greenfox.pixam2.repositories;

import com.greenfox.pixam2.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order,Long> {
}
