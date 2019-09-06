package com.greenfox.swagger1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SwaggerAPIController {
    @GetMapping("/products")
    public List<String> getProducts() {
        List<String> productList = new ArrayList<>();
        productList.add("Heney");
        productList.add("Almond");
        return productList;
    }

    @PostMapping("/products")
    public String createProduct() {
        return "Product is saved succesfully";
    }
}
