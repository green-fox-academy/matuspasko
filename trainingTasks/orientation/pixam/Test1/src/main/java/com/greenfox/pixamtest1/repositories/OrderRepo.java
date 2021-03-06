package com.greenfox.pixamtest1.repositories;

import com.greenfox.pixamtest1.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepo extends CrudRepository<Order, Long> {

    @Query(value = "SELECT pizza FROM  orders GROUP BY pizza ORDER BY COUNT(*) DESC LIMIT 3", nativeQuery = true)
    List<String> findThreeMostOrderedPizzas();
}
