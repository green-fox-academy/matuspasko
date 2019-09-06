package com.greenfox.aliasurl.controllers;

import com.greenfox.aliasurl.models.Link;
import com.greenfox.aliasurl.servicies.LinkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    LinkService linkService;

    public MainController(LinkService linkService){
        this.linkService = linkService;
    }

    @GetMapping("/")
    public String displayAlias(Model model,
                               @RequestParam (required = false) String alias,
                               @RequestParam (required = false) String secretCode,
                               @RequestParam(required = false) boolean error){

        model.addAttribute("newLink", new Link());
        model.addAttribute("displayAlias",alias);
        model.addAttribute("displaySecreCode",secretCode);
        model.addAttribute("displayError",error);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveAlias(@ModelAttribute Link link){
        if (linkService.checkIfAliasExist(link.getAlias())){
            linkService.saveAlias(link);
            return "redirect:/?alias=" +link.getAlias() + "&secretCode=" + link.getSecretCode();
        }
        return "redirect:/?error=true";
    }

    @GetMapping("/edit/{id}")
    public String editLinkById(Model model, @PathVariable long id){
        model.addAttribute("link", linkService.findLink(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editLink(@ModelAttribute Link link){
        linkService.saveAlias(link);
        return "redirect:/";

    }


    // Toto je zobrazenie alias podla tej metody z Pixam
//    @GetMapping("/")
//    public String displayAlias(  Model model ){
//        model.addAttribute("newLink", new Link());
//        return "index";
//    }
//
//    @PostMapping("/save-link")
//    public String saveAlias(@ModelAttribute Link link){
//        linkService.saveAlias(link);
//        return "redirect:/display/" +link.getId();
//    }
//
//    @GetMapping("/display/{id}")
//    public String findLink(@PathVariable long id, Model model){
//        model.addAttribute("savedLink", linkService.findLink(id));
//        return "display";
//    }
}
