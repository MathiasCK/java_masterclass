package academy.learnprogramming;

public class Vehicle {

    private String type;
    private int direction;

    public Vehicle(String type) {
        this.type = type;
        this.direction = 0;
    }

    public int steer(int direction) {
        System.out.println("Vehicle.steer()");
        this.direction += direction;
        return this.direction;
    }

    public int getDirection() {
        System.out.println("Vehicle.getDirection()");
        return direction;
    }

    public String getType() {
        System.out.println("Vehicle getType()");
        return type;
    }
}
