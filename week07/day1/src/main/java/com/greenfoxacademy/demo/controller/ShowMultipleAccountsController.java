package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@Controller
public class ShowMultipleAccountsController {

    List<BankAccount> listOfAccounts = new ArraysList();

    public ShowMultipleAccountsController() {
        (new BankAccount("Simba", 2000, "lion", true);
        new BankAccount("Bimbo", 5000, "elephant", false);
        new BankAccount("Falker", 1000, "giraffe", false);
        new BankAccount("Pooh", 10000, "bear", false);
        new BankAccount("Elsa", 5000, "tiger", false));
    }

    @RequestMapping(path = "/showMultipleAccounts", method = RequestMethod.GET)
    public String displayAccount(Model model) {
        model.addAttribute("listOfAccont", listOfAccounts);
        model.addAttribute("currency", "Zebra");
        model.addAttribute("shiny", "color: gold");
        return "showMultipleAccounts";
    }

}

