package com.greenfox.pixam.controllers;

import com.greenfox.pixam.models.Order;

import com.greenfox.pixam.servicies.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String displeyMain(Model model) {
        model.addAttribute("newOrder", new Order());
        return "index";
    }

    @PostMapping("/")
    public String saveOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String displayOrder(@PathVariable long id, Model model) {
        model.addAttribute("savedOrder", orderService.findOrder(id));
        return "order";
    }

}
