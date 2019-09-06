package com.greenfox.pixam.controllers;

import com.greenfox.pixam.models.Order;
import com.greenfox.pixam.servicies.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    private OrderService orderService;

    public APIController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("api/orders/{id}")
    public ResponseEntity getOrder(@PathVariable long id) {
        return new ResponseEntity(orderService.findOrder(id).get(), HttpStatus.ACCEPTED);
    }
}
