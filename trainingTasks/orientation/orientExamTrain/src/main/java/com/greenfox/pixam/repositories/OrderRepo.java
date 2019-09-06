package com.greenfox.pixam.repositories;

import com.greenfox.pixam.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order,Long> {


}
