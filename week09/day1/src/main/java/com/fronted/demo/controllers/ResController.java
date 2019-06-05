package com.fronted.demo.controllers;

import com.fronted.demo.models.Doubled;
import com.fronted.demo.models.MyError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam(required = false) Integer input){
        if (input != null){
            return new Doubled(input);
//            return "{received: " + input + "," + "result: " + input * 2 + "}";
        }else {
            return new MyError("Please provide an input!");
//            return "error: Please provide an input!";
        }
    }
}

