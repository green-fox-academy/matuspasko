package com.url.demo.controllers;

import com.url.demo.models.URLAlias;
import com.url.demo.services.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class URLController {

    URLService service;

    @Autowired
    public URLController(URLService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderedRoot(Model model) {
        model.addAttribute("urlAlias", service.getItemToDiesplay());
        model.addAttribute("message", "");
        model.addAttribute("stored", service.getItemToDiesplay());

        return "index";
    }

    @PostMapping("/save-link")
    public String renderSaveLink(Model model, @ModelAttribute URLAlias urlAlias) {
        boolean isStored = service.isAlreadyStored(urlAlias.getAlias());

        if (isStored) {
            //error scenario
            model.addAttribute("message", "Your alias is already in used");
            model.addAttribute("urlAias", urlAlias);
            model.addAttribute("stored", true);
            service.setItemToDiesplay(urlAlias);

        } else {
            //succes senario
            service.save(urlAlias);
            String message = "Your url is aliased to"
                    + urlAlias.getAlias()
                    + "and your secret code is"
                    + urlAlias.getSecretCode();

            model.addAttribute("message", message);
            model.addAttribute("urlAlias", new URLAlias());
            model.addAttribute("stored" , false);
            service.setItemToDiesplay(new URLAlias());
        }
        return "index";
    }
}
