package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(balance >= amount)
            balance -= amount;
    }
}
