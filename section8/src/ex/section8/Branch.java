package ex.section8;

import java.util.ArrayList;

public class Branch {

    private String name;
    private  ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addNewCustomer(String customerName, double value) {
        Customer customer = findCustomer(customerName);
        if(customer != null) {
            System.out.println("Sorry a customer with the name " + customerName + " already exists!");
            return;
        }
        customer.newCustomer(customerName, value);
    }

    public void addCustomerTransaction(String customerName, double value) {
            Customer customer = findCustomer(customerName);
            if(customer != null) {
                customer.addTransaction(value);
            }
        System.out.println("Sorry a customer with the name " + customerName + " does not exist!");
    }

    public Customer findCustomer(String customerName) {
        return customers.stream().filter(c -> c.getName().equals(customerName)).findFirst().orElse(null);
    }

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public void displayCustomersForBranch() {
        customers.forEach(customer -> System.out.println("Customer: " + customer.getName() + "\n" + customer.getTransactions()));
    }


    public String getName() {
        return name;
    }


}
