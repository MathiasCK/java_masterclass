package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

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

    public static void main(String[] args) {

        Customer customer = new Customer("Mathias", 3000.20);
        Customer another;
        another = customer;
        another.setBalance(1000.20);

        System.out.println("customer balance : " + customer.getBalance()); // 1000.2
        System.out.println("another balance : " + another.getBalance()); // 1000.2

        ArrayList<Integer> intList = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++) {
            intList.add(i);
        }

        intList.add(1, 22);

        System.out.println(intList.toString());
    }
}
