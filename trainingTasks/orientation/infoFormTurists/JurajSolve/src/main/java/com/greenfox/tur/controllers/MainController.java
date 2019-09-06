package com.greenfox.tur.controllers;

import com.greenfox.tur.repositories.AttractionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    AttractionRepo attractionRepo;

    @GetMapping("/")
    public String displayMain(Model model
//                              @RequestParam (required = false) Long id,
//                              @RequestParam (required = false) String name,
//                              @RequestParam (required = false) String city,
//                              @RequestParam (required = false) Integer price,
//                              @RequestParam (required = false) Double longitude,
//                              @RequestParam (required = false) Double latitude,
//                              @RequestParam (required = false) String category,
//                              @RequestParam (required = false) Integer duration,
//                              @RequestParam (required = false) Integer recommendedAge
                             ){
        model.addAttribute("attractions", attractionRepo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addAttraction( @RequestParam (required = false) Long id,
                                 @RequestParam String name,
                                 @RequestParam String city,
                                 @RequestParam Integer price,
                                 @RequestParam Double longitude,
                                 @RequestParam Double latitude,
                                 @RequestParam String category,
                                 @RequestParam Integer duration,
                                 @RequestParam Integer recommendedAge) {

        if (name == "" || city == "" || price == null || longitude == null || latitude == null || category == "" || duration == null
        || recommendedAge == null);
        return ("redirect:/");
    }




}
