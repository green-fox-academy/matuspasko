package com.springex.demo.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component

public class Model  {

    private String name;

    public Model() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model(String name) {
        this.name = "Matus";
    }
}
