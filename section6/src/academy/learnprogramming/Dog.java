package academy.learnprogramming;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, true, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public String rest(String resting) {
        String rest = super.rest(resting);
        return "A dog is " + rest;
    }

    private void chew() {
        System.out.println("Chew chew");
    }

    @Override
    public String eat(String food) {
        String dogFood = super.eat(food);
        chew();
        return "Dog is eating: " + dogFood;
    }


    @Override
    public String move(String movement) {
        String dogMovement = super.move(movement);
        return "Dog is: " + dogMovement;
    }
}
