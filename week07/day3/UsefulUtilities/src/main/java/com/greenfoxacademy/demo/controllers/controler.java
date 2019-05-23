package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.useful.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controler {

    @Autowired
    UtilityService myUtilityService;

    @GetMapping("/useful")
    public String displayUsefulPage() {
        return "mainPage";
    }

    @GetMapping("/useful/colored")
    public String displayColoredPage(Model model) {
        model.addAttribute("backgroundColor", "background-color:" + myUtilityService.randomColor());
        return "coloredPage";
    }
}
