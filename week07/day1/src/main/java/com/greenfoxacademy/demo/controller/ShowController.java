package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;

@Controller
public class ShowController {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");

    @RequestMapping( path = "/show", method = RequestMethod.GET)
    public String displayAccount(Model model){
        model.addAttribute("account", bankAccount);
        model.addAttribute("currency","Zebra");
        return "index";
    }
}
