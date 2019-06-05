package com.simba.demo.models;


public class BankAccount {

    private int index;
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getKing() {
        String str = "";

        if (isKing) {
            str = "king";
        }
        return str;
    }

    public BankAccount(int index, String name, double balance, String animalType) {
        this.index = index;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, double balance, String animalType, int index) {

        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.index = index;
        this.isKing = isKing;
    }

    public BankAccount(String simba, double v, String lion, int i, boolean isKing) {
        this.isKing = isKing;
    }
}

