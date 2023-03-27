package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String breadRoll, String protein) {
        super(breadRoll, protein, 0, 0, 0, 0, 1, 1);
        super.setPrice(17);
        super.setChipsPrice(0);
        super.setDrinkPrice(0);
    }

    @Override
    public int getMaxAddOns() {
        return super.getMaxAddOns() - 2;
    }

    @Override
    public String displayAddOns() {
        return "The deluxe burger has no add ons but is served with chips and drink included";
    }

}
