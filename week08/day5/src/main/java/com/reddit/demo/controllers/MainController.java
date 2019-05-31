package com.reddit.demo.controllers;

import com.reddit.demo.services.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    PostsService service;


    @GetMapping("/")

    public String testPath(Model model){
        PostsService listPostsService =new PostsService();
        model.addAttribute("postsFromPostService", listPostsService.getPostsList());
        return "index";
    }
}
