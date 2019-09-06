package com.greenfox.shortening.controllers;

import com.greenfox.shortening.models.Url;
import com.greenfox.shortening.servicies.UrlService;
import com.greenfox.shortening.servicies.UrlServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private UrlService urlService;

    public MainController(UrlService urlService ){
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String displayUrl(Model model){
        model.addAttribute("newUrl", new Url());
        return "index";
    }

    @PostMapping("/")
    public String saveUrl(@ModelAttribute Url url){
        urlService.saveUrl(url);
        return "redirect:/";
    }



}
