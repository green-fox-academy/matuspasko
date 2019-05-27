package com.example.demo.models;

public class ShopItem {
    private String typeOfToy;
    private String color;
    private int ammount;
    private int price;

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
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

    public ShopItem(String typeOfToy, String color, int ammount, int price) {
        this.typeOfToy = typeOfToy;
        this.color = color;
        this.ammount = ammount;
        this.price = price;
    }
}
