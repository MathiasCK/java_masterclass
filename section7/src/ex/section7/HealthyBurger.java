package ex.section7;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Healthy brwad");
    }

    public void addHealthyAddition1(String addition, double price) {
        this.healthyExtra1Name = addition;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String addition, double price) {
        this.healthyExtra2Name = addition;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.healthyExtra1Name != null) {
            System.out.println("Healthy extra 1");
            hamburgerPrice += this.healthyExtra1Price;
        }

        if(this.healthyExtra2Name != null) {
            System.out.println("Healthy extra 2");
            hamburgerPrice += this.healthyExtra2Price;
        }

        return hamburgerPrice;
    }
}
