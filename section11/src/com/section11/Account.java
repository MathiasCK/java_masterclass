package com.section11;

import java.util.ArrayList;

public class Account {

    public String name;
    public double balance = 0;
    public ArrayList<Double> transactions;

    public Account(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Balance is now " + this.balance);
            return;
        }
        error();
    }

    public void withdraw(double amount) {
        double withdrawal = -amount;
        if(withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println("Balance is now " + this.balance);
            return;
        }
        error();
    }

    public void calculateBalance() {
        this.balance = 0;
        for(double i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Balance is now " + this.balance);
    }

    public void error() {
        System.out.println("Error!");
    }

    public static void main(String[] args) {

        Account mathias = new Account("Mathias");
        mathias.deposit(1000);
        mathias.withdraw(7865);
        mathias.deposit(5000);

        mathias.balance = 5000;
        mathias.transactions.add((double) 999);

    }
}
