package com.example.demo.models;

public class ShopItem {

    private String name;
    private String lastName;
    private String dayOfBirth;
    private String dayOfDie;

    public ShopItem(String name, String lastName, String dayOfBirth, String dayOfDie) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.dayOfDie = dayOfDie;
    }

    public ShopItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getDayOfDie() {
        return dayOfDie;
    }

    public void setDayOfDie(String dayOfDie) {
        this.dayOfDie = dayOfDie;
    }
}