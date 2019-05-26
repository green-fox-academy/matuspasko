package com.example.demo.controllers;

import com.example.demo.Models.ShopItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    List<ShopItem> items;
@Autowired
    public MainController() {
        items.add(new ShopItem("Peter", "Holol", "1999","2089"));
        items.add(new ShopItem("Peter1", "Holol1", "19991","20891"));
        items.add(new ShopItem("Peter2", "Holol2", "19992","20892"));
    }

    @RequestMapping(path = "/form")
    public String displayForm() {
        return "index";
    }

    @GetMapping("/form")
    public String table(Model model) {

        model.addAttribute("listTable", items);
        return "index";
    }

    @RequestMapping(path = "/welcome", method = RequestMethod.GET)

    public String returnForm(Model model, @RequestParam(required = false) String name1, String lastname, String addresing) {

        model.addAttribute("name", name1);
        model.addAttribute("lastname", lastname);
        model.addAttribute("addresing", addresing);

        return "welcome";
    }
}
