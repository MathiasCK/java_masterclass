package ex.section8;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addNewCustomerToBranch(String customerName, String branchName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.addNewCustomer(customerName, transaction);
            return;
        }
        Branch newBranch = createNewBranch(branchName);
        newBranch.addNewCustomer(customerName, transaction);
    }

    public void addCustomerTransaction(String customerName, String branchName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            Customer customer = branch.findCustomer(customerName);
            if(customerName != null) {
                customer.addTransaction(transaction);
            }
            System.out.println("We could not find a customer by the name " + customerName + " in the branch " + branchName);
            return;
        }
        System.out.println("Sorry we could not find the branch " + branchName);
    }

    public Branch createNewBranch(String branchName) {
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        return newBranch;
    }

    public Branch findBranch(String branchName) {
        return branches.stream().filter(c -> c.getName().equals(branchName)).findFirst().orElse(null);
    }

}
