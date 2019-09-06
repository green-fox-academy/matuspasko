package com.greenfox.aliasurl.controllers;

import com.greenfox.aliasurl.servicies.LinkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ApiController {

    LinkService linkService;

    public ApiController(LinkService linkService){
        this.linkService = linkService;
    }
// zobrazi jason objectu podla ID
    @GetMapping("/api/links/{id}")
    public Optional getLink(@PathVariable long id){
        return linkService.findLink(id);
    }

    // zobrazi vsechni jason
    @GetMapping("/api/links")
    public Iterable getLinks(){
        return linkService.findAll();
    }

    //vymaze podla Id
    @DeleteMapping("/api/links/{id}")
    public void deleteLink(@PathVariable long id){
        linkService.deleteByIdLink(id);
    }

}
