package com.example.demo.controllers;

import com.example.demo.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    // tu vytvorime list item, ako parameter tam davame class ShopItem
    List<ShopItem> items;


    public MainController() {
        // nezabudni vytvorit array list v constructry
        this.items = new ArrayList<>();

        // vzdy musim mat popridavene nieco do tej tabulky
        items.add(new ShopItem("Peter", "Holol", "1999", "2089"));
        items.add(new ShopItem("Peter1", "Holol1", "19991", "20891"));
        items.add(new ShopItem("Peter2", "Holol2", "19992", "20892"));
    }

    @GetMapping("/form")
    public String table(Model model) {

        model.addAttribute("listTable", items);// dvolezite je zavolat to cez items.getItems()
        return "index";
    }
}
