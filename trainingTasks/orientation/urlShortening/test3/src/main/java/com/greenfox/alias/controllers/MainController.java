package com.greenfox.alias.controllers;

import com.greenfox.alias.models.Alias;
import com.greenfox.alias.servicies.AliasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private AliasService aliasService;

    public MainController(AliasService aliasService) {
        this.aliasService = aliasService;
    }

    @GetMapping("/")
    public String displayAlias(Model model){
        model.addAttribute("newAlias", new Alias());
        return "index";
    }

    @PostMapping("/")
    public String saveAlias(@ModelAttribute Alias alias){
        aliasService.saveAlias(alias);
        return "redirect:/";
    }
}
