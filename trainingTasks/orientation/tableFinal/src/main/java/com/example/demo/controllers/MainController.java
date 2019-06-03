package com.example.demo.controllers;

import com.example.demo.models.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

    Items items = new Items();

    @GetMapping("/main")
    public String tableOfItems(Model model) {
        model.addAttribute("table", items.getItems());

        return "index";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam(required = false) String search){
        model.addAttribute("storeSearch", items.searchItems(search));
        return "search";
    }
}
