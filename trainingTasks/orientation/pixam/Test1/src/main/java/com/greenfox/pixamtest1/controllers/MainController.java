package com.greenfox.pixamtest1.controllers;

import com.greenfox.pixamtest1.models.Menu;
import com.greenfox.pixamtest1.models.Order;
import com.greenfox.pixamtest1.servicies.OrderService;
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
    public String displayOrder(Model model) {
        model.addAttribute("newOrder", new Order());
        model.addAttribute("pizzas", new Menu().getPizzas());
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

    @GetMapping("statistics")
    public String displayStatistic(Model model) {
        model.addAttribute("topPizzas", orderService.findThreeMostOrderedPizzas());
        return "statistics";
    }
}
