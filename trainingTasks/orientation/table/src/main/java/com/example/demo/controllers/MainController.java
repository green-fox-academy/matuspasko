package com.example.demo.controllers;

import com.example.demo.models.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    Items items = new Items();


    // sluzi na to aby sme zavolali endpoint, a co ten endpoint urobi
    @GetMapping("/form")
    public String table(Model model) {

        model.addAttribute("listTable", items.getItems());// dvolezite je zavolat to cez items.getItems()
        return "index";
    }

    @GetMapping("/sorted")
    public String tableSorted (Model model){
        model.addAttribute("listTable",items.yungest());
        model.addAttribute("oldest",items.oldestOne());
        return "index";
    }

    @GetMapping("/reverse")
    public String tableReverse (Model model){
        model.addAttribute("listTable",items.oldest());

        return "index";
    }

    @GetMapping("/oldone")
    public String tableOldOne (Model model){
        model.addAttribute("tableSearch", items.oldest());

        return "index";
    }
}

