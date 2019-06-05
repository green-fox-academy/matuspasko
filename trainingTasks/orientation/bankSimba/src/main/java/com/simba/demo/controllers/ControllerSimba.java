package com.simba.demo.controllers;

import com.simba.demo.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ControllerSimba {

    List<BankAccount> accounts;

    public ControllerSimba() {
        this.accounts = new ArrayList<>(Arrays.asList(new BankAccount("Simba", 2000.00, "lion", 0, true),
                new BankAccount("Zebra", 2000.00, "Zebra", 1)));

        this.movieAccounts = new ArrayList<>(Arrays.asList(new BankAccount("Hakuma", 0, "tata", 0),
                new BankAccount("Timon", 90, "Tr", 1),
                new BankAccount("Pumba", 190, "Vu", 2)));
    }

    @GetMapping("/show")
    public String showWiev(Model model) {
        model.addAttribute("accounts", accounts);

        return "index";
    }

    @GetMapping("/showhtml")
    public String showHtml(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", text);
        return "display";
    }

    List<BankAccount> movieAccounts;

    @GetMapping("/accounts")
    public String showAccounts(Model model) {
        model.addAttribute("movieAcc", movieAccounts);
        return "few";
    }
}
