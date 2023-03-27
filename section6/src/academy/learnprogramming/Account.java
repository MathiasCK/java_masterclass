package academy.learnprogramming;

public class Account {

    private int number;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public Account() {
        this(0, 0.0, "Default name", "Default address", 12345);
    }

    public Account(int number, double balance, String name, String email, int phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Account(String name, String email, int phone) {
        this(99999, 0.0, name, email, phone);
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit needs to be above " + amount + "!");
            return this.balance;
        };

        return this.balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) {
            System.out.println("Insignificant funds, withdrawal denied!");
            return this.balance;
        };

        return this.balance -= amount;
    }

    public static void main(String[] args) {

        Account mathias = new Account(280300, 100_000, "Mathias", "Email", 47683559);

        mathias.deposit(-1);
        System.out.println( mathias.deposit(100_000));

        System.out.println(mathias.withdraw(200_000));
        mathias.withdraw(10);

    }

}
