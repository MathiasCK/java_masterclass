package academy.learnprogramming;

public class Car extends Vehicle {

    private boolean isElectric;
    private boolean isManual;
    private int doors;
    private int wheels;

    public Car(int wheels, int doors, boolean isElectric, boolean isManual) {
        super("Car");
        this.wheels = wheels;
        this.doors = doors;
        this.isElectric = isElectric;
        this.isManual = isManual;
    }

    @Override
    public int steer(int direction) {
        System.out.println("Car.steer()");
        return super.steer(direction);
    }

    public String shiftGears(int gear) {
        System.out.println("Car.shiftGears()");
        return "Gear " + gear;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getWheels() {
        System.out.println("Car.getWheels()");
        return wheels;
    }

    public int getDoors() {
        System.out.println("Car.getDoors()");
        return doors;
    }
}
