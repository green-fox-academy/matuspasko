package com.exam.demo.controllers;

import com.exam.demo.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainPage(){
        return "index";
    }


    // tu chces pozret ci meno a heslo je platne
    @PostMapping("/save-link")
    public String save(){
        Model savedLink = null;
        try {
            savedLink =
        }
        return "index";
    }


}
