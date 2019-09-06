package com.greenfox.pixamtest1.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> pizzaMenu;

    public Menu() {
        this.pizzaMenu = new ArrayList<>();

        pizzaMenu.add("Margerita");
        pizzaMenu.add("Klobasova");
        pizzaMenu.add("Tuniakova");
        pizzaMenu.add("Sunkova");
        pizzaMenu.add("Special");
    }

    public List<String> getPizzas() {
        return pizzaMenu;
    }
}
