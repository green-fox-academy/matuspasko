package com.example.demo.models;
// cely tento class je vytvoreny objekt kde pridavme polozkky do ShopItem

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Items {
    List<ShopItem> items;

    public Items() {
        this.items = new ArrayList<>();

        items.add(new ShopItem("vibrator", "blue", 32, 230));
        items.add(new ShopItem("anca gumena", "black", 3, 5300));
        items.add(new ShopItem("condoms", "pink", 1000, 98));
        items.add(new ShopItem("bicik", "leathery", 7, 899));
        items.add(new ShopItem("plug in", "gold", 3, 6890));
        items.add(new ShopItem("plug in sign by Karl Goth", "white", 1, 1000));

    }

    public List<ShopItem> getItems() {
        return items.stream().collect(Collectors.toList());
    }
    // tuna mame controller na  hladanie v tabulke podla TypeOfToy alebo Color
    public List<ShopItem> searchItems(String searchInput){
        return items.stream()
                .filter(i -> i.getTypeOfToy().contains(searchInput) || i.getColor().contains(searchInput))
                .collect(Collectors.toList());
    }
}
