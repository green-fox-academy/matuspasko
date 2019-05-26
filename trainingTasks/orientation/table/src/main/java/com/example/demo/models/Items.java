package com.example.demo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Items {
    List<ShopItem> items;

    public Items() {
        this.items = new ArrayList<>();// ked tu nedam new ArrayList tak to bude vyhazdovat chybu

        items.add(new ShopItem("Peter", "Holol", 1999, 2089));
        items.add(new ShopItem("Marek", "Drak", 1991, 2079));
        items.add(new ShopItem("Lada", "Dron", 1992, 2069));
        items.add(new ShopItem("Vlasta", "Pavlova", 1993, 2059));
    }

    // cely tento constructor sluzi na to aby sme vybrali list z Items
    public List<ShopItem> getItems() {
        return items.stream().collect(Collectors.toList());
    }

    public List<ShopItem> yungest() {
        return items.stream()
                .sorted(Comparator.comparing(ShopItem::getDayOfBirth))//
                .collect(Collectors.toList());

    }

    public List<ShopItem> oldest() {
        return items.stream()
                .sorted(Comparator.comparing(ShopItem::getDayOfBirth).reversed())// na vypisanie najstarsieho staci pridat .reverse
                .collect(Collectors.toList());
        // .sorted(Comparator.reverseOrder(ShopItem::getDayOfBirth))
        //  .collect(Collectors.toList());
    }

    public ShopItem oldestOne(){ // vraciame iba jednu polozku takze dame iba ShopItem misto <ShopItem>
        return items.stream()
                .max(Comparator.comparing(ShopItem::getDayOfBirth)) // ziskame max cislo
                .get();   // kedze vraciame iba jednu vec pozivame .get miesto .collect

    }

    public ShopItem youngestOne(){
        return items.stream()
                .min(Comparator.comparing(ShopItem::getDayOfBirth))
                .get();
    }
}

