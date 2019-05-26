package com.example.demo.models;

public class ShopItem {
    private String typeClothes;
    private String color;
    private int ammount;
    private int price;

    public String getTypeClothes() {
        return typeClothes;
    }

    public void setTypeClothes(String typeClothes) {
        this.typeClothes = typeClothes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ShopItem(String typeClothes, String color, int ammount, int price) {
        this.typeClothes = typeClothes;
        this.color = color;
        this.ammount = ammount;
        this.price = price;
    }
}
