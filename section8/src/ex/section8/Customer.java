package ex.section8;

import java.util.ArrayList;

public class Customer {

    private String name;
    private  ArrayList<Double> transactions = new ArrayList<Double>();


    public void addTransaction(double value) {
        transactions.add(value);
    }

    public void newCustomer(String name, double value) {
        this.name = name;
        this.transactions.add(value);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
