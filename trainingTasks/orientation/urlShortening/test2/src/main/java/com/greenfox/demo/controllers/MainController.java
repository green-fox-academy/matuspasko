package com.greenfox.demo.controllers;

import com.greenfox.demo.models.Url;
import com.greenfox.demo.servicies.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private UrlService urlService;

    public MainController(UrlService urlService){
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String diplayUrl(Model model){
        model.addAttribute("newUrl", new Url());
        return "index";
    }

    @PostMapping("/")
    public String saveUrl(@ModelAttribute Url url){
        urlService.saveUrl(url);
        return "redirect:/";
    }

    @GetMapping("/save-link")
    public String findUrl(@PathVariable long id, Model model){
        model.addAttribute("savedUrl", urlService.findUrl(id));
        return "diplayUrl";
    }

}
