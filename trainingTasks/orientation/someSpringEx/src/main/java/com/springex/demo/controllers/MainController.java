package com.springex.demo.controllers;

import com.springex.demo.models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @Autowired
    Model service;

//
//    public void test()  {
//        System.out.println(service.getName());


    @GetMapping("/")
    public String display() {
        return "index";
    }
}
