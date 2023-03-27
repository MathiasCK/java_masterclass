package ex.section7;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Some meat", 14.10, "White");
        super.addHamburgerAddition1("Drink", 2);
        super.addHamburgerAddition2("Chips", 3);
    }

    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("Cannot!");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("Cannot!");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("Cannot!");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("Cannot!");
    }

}
