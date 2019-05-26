package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Items {
    List<ShopItem> items;

    public Items(){
        this.items = new ArrayList<>();

        items.add(new ShopItem("shirt","blue",32,230));
        items.add(new ShopItem("jacket","black",3,5300));
    }

    public List<ShopItem> getItems() {
        return items.stream().collect(Collectors.toList());
    }
}
