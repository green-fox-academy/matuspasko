package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Mat", "Pasko", 1000.00);
        double balane = account.deposit(200.00, true);
        assertEquals(1200.00, balane, 0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet be implemented");
    }

    @org.junit.Test
    public void getBBalance() {
        fail("This test has yet be implemented");
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount account = new BankAccount("Mat", "Pasko", 1000.00);
        double balane = account.deposit(200.00, true);
        assertEquals(1200.00, balane, 0);
    }

}