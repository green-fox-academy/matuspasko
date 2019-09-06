package com.greenfox.pixam1_1.controllers;

import com.greenfox.pixam1_1.models.Order;
import com.greenfox.pixam1_1.servicies.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String displayOrder(Model model) {
        model.addAttribute("newOrder", new Order());
        return "index";
    }

    @PostMapping("/")
    public String saveOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String findOrder(@PathVariable long id, Model model) {
        model.addAttribute("savedOrder", orderService.findOrder(id));
        return "order";
    }
}
