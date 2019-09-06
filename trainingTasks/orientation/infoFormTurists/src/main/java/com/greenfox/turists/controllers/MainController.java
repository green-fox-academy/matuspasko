package com.greenfox.turists.controllers;

import com.greenfox.turists.models.Attraction;
import com.greenfox.turists.repositories.AttractionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    AttractionRepo attractionRepo;

    @GetMapping("/")
    public String displayAttractions(Model model){
        model.addAttribute("attractions", attractionRepo.findAll());
        model.addAttribute("addAtraction", new Attraction());
        return "index";
    }

    @PostMapping("/add")
    public String saveAttraction(@ModelAttribute Attraction attraction){
        attractionRepo.save(attraction);
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String editAttractionByID(@ModelAttribute Attraction attraction){
        attractionRepo.save(attraction);
        return "redirect:/";
    }







}
