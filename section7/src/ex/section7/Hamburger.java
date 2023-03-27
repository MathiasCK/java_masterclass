package ex.section7;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String addition, double price) {
        this.addition1Name = addition;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String addition, double price) {
        this.addition2Name = addition;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String addition, double price) {
        this.addition3Name = addition;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String addition, double price) {
        this.addition4Name = addition;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        if(this.addition1Name != null) {
            System.out.println("1 added");
            hamburgerPrice += this.addition1Price;
        }

        if(this.addition2Name != null) {
            System.out.println("2 added");
            hamburgerPrice += this.addition2Price;
        }

        if(this.addition3Name != null) {
            System.out.println("3 added");
            hamburgerPrice += this.addition3Price;
        }

        if(this.addition4Name != null) {
            System.out.println("4 added");
            hamburgerPrice += this.addition4Price;
        }

        return hamburgerPrice;
    }
}
