package academy.learnprogramming;

public class VipCustomer {

    final private String name;
    final private double creditLimit;
    final private String email;

    public VipCustomer() {
        this("Unknown", 0.0, "unknown@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 10.0, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
