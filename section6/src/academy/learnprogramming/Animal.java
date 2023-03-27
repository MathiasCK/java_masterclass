package academy.learnprogramming;

public class Animal {

    private String name;
    private int brain;
    private boolean body;
    private int size;
    private int weight;

    public Animal(String name, int brain, boolean body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String rest(String resting) {
        return resting;
    }

    public String eat(String food) {
        return food;
    }

    public String move(String movement) {
        return movement;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public boolean getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
