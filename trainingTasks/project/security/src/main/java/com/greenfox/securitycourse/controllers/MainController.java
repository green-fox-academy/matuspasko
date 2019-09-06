package com.greenfox.securitycourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/dashboard")
    public String getDashboard(){
        return "index";
    }
}
