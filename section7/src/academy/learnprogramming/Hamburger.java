package academy.learnprogramming;

public class Hamburger {

    private final int lettucePrice = 2;
    private final int dressingPrice = 3;
    private final int tomatoPrice = 1;
    private final int cucumberPrice = 1;

    private int drinkPrice = 5;
    private int chipsPrice = 4;
    private int price = 10;
    private int maxAddOns = 4;

    private String breadRoll;
    private String protein;
    private int lettuce;
    private int dressing;
    private int tomato;
    private int cucumber;
    private int drink;
    private int chips;

    public Hamburger(String breadRoll, String protein, int lettuce, int dressing, int tomato, int cucumber, int drink, int chips) {
        int hamburgerAddOns = lettuce + dressing + tomato + cucumber + drink + chips;
        if(hamburgerAddOns > this.getMaxAddOns()) {
            System.out.println("Only choose "+ this.getMaxAddOns() + " add ons!");
            return;
        }

        this.breadRoll = breadRoll;
        this.protein = protein;
        this.lettuce = lettuce;
        this.dressing = dressing;
        this.tomato = tomato;
        this.cucumber = cucumber;
        this.drink = drink;
        this.chips = chips;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxAddOns(int maxAddOns) {
        this.maxAddOns = maxAddOns;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public void setChipsPrice(int chipsPrice) {
        this.chipsPrice = chipsPrice;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public int getChipsPrice() {
        return chipsPrice;
    }

    public int getMaxAddOns() {
        return maxAddOns;
    }

    public int getPrice() {
        return this.price;
    }

    public String displayPrice() {
        return "Total price for " + getClass().getSimpleName() +" is: " + (getPrice() + (cucumberPrice * cucumber) + (dressingPrice * dressing) + (tomatoPrice * tomato) + (lettucePrice * lettuce) + (getDrinkPrice() * drink) + (getChipsPrice() * chips)) + "$";
    }

    public String displayAddOns() {
        return "The " + getClass().getSimpleName() + " is made with " + this.breadRoll + " bread and " + this.protein + ". It's add ons is: " + lettuce + " : lettuce, " + dressing + " dressing, " + tomato + " tomato, " + cucumber + " cucumber";
    }

    public static void main(String[] args) {

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe bread", "Deluxe protein");
        System.out.println(deluxeBurger.displayPrice());
        System.out.println(deluxeBurger.displayAddOns());
    }
}
