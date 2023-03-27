package academy.learnprogramming;

public class HealthyBurger extends Hamburger {


    public HealthyBurger(int lettuce, int dressing, int tomato, int cucumber, int drink, int chips) {
        super("Brown rye roll", "Hallomui", lettuce, dressing, tomato, cucumber, drink, chips);
        super.setPrice(8);
    }

    @Override
    public int getMaxAddOns() {
        return super.getMaxAddOns() + 2;
    }

}
