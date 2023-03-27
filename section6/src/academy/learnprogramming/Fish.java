package academy.learnprogramming;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, false, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public String rest(String resting) {
        String rest = super.rest(resting);
        return "A fish is " + resting;
    }

    private void moveMuscles() {
        System.out.println("Moving muscles");
    }

    private void moveFin() {
        System.out.println("Moving fin");
    }

    @Override
    public String move(String movement) {
        moveMuscles();
        moveFin();
        String swim = super.move(movement);
        return "A fish is " + swim;
    }
}
