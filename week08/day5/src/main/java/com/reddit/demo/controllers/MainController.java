package com.reddit.demo.controllers;

import com.reddit.demo.services.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {


    @GetMapping("/")

    public String testPath(Model model) {
        PostsService listPostsService = new PostsService();
        model.addAttribute("postsFromPostService", listPostsService.getPostsList());
        return "index";
    }


    @GetMapping("/submit")
    public String submitForm(Model model) {
        return "submit";

    }

    @GetMapping("/main")
    public String tableOfItems(Model model) {
        model.addAttribute("table", ;

        return "index";
    }
}
