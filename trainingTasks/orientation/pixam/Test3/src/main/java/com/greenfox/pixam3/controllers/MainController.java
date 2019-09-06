package com.greenfox.pixam3.controllers;

import com.greenfox.pixam3.models.Menu;
import com.greenfox.pixam3.models.Order;
import com.greenfox.pixam3.services.OrderService;
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
    public String diplayOrder(Model model){
        model.addAttribute("newOrder", new Order());
        model.addAttribute("pizzas", new Menu().getPizzaMenu());
        return "index";
    }

    @PostMapping("/")
    public String saveOrderr(@ModelAttribute Order order){
        orderService.saveOrder(order);
        return "redirect:/order/" + order.getId();
    }

    @GetMapping("/order/{id}")
    public String findOrder(@PathVariable long id, Model model){
        model.addAttribute("saveOrder", orderService.findOrder(id));
        return "order";
    }

    @GetMapping("statistics")
    public String displayStatistics(Model model){
        model.addAttribute("topPizzas", orderService.findThreeMostOrderedPizzas());
        return "statistics";
    }
}
