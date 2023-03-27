package academy.learnprogramming;

public class Calculator {

    final private Floor floor;
    final private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
