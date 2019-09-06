package com.greenfox.pixam2.controllers;

import com.greenfox.pixam2.models.Order;
import com.greenfox.pixam2.servicies.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private OrderService orderService;

    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String displayMain(Model model){
        model.addAttribute("newOrder", new Order());
        return "index";
    }

    @PostMapping("/")
    public String saveOrder(@ModelAttribute Order order){
        orderService.saveOrder(order);
        return "redirect:/";

    }
}

