
package com.example.demo.models;

public class ShopItem {

    private String name;
    private String lastName;
    private int dayOfBirth;
    private int dayOfDie;

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

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfDie() {
        return dayOfDie;
    }

    public void setDayOfDie(int dayOfDie) {
        this.dayOfDie = dayOfDie;
    }

    public ShopItem(String name, String lastName, int dayOfBirth, int dayOfDie) {
        this.name = name;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.dayOfDie = dayOfDie;
    }
}