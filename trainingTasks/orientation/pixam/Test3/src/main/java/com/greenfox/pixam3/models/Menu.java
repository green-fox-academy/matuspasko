package com.greenfox.pixam3.models;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<String> pizzaMenu;

    public Menu(){
        this.pizzaMenu = new ArrayList<>();

        pizzaMenu.add("Olivova");
        pizzaMenu.add("Sunkova");
        pizzaMenu.add("Syrova");
        pizzaMenu.add("Margerita");
        pizzaMenu.add("Hawai");
    }

    public List<String> getPizzaMenu() {
        return pizzaMenu;
    }

    public void setPizzaMenu(List<String> pizzaMenu) {
        this.pizzaMenu = pizzaMenu;
    }


}
