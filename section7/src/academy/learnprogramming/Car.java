package academy.learnprogramming;

public class Car {

    private String type;
    private int wheels;
    private int doors;
    private boolean engine;

    public Car(String type) {
        this.type = type;
        this.wheels = 4;
        this.doors = 4;
        this.engine = true;
    }

    public String getType() {
        return type;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean getEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Engine started from Car class");
    }

    public void accelerate() {
        System.out.println("Accelerating from Car class");
    }

    public void brake() {
        System.out.println("Breaking from Car class");
    }

    public static void main(String[] args) {

        System.out.println("Car:");

        Car car = new Car("Car");
        car.accelerate();
        car.startEngine();
        car.brake();

        System.out.println();
        System.out.println("BMW:");

        BMW bmw = new BMW();
        bmw.accelerate();
        bmw.startEngine();
        bmw.brake();

        System.out.println();
        System.out.println("Mercedes:");

        Mercedes mercedes = new Mercedes();
        mercedes.accelerate();
        mercedes.startEngine();
        mercedes.brake();
    }

}

 class BMW extends Car {

    public BMW() {
        super("BMW");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started from BMW class");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating fro BMW class");
    }

}

 class Mercedes extends Car {

    public Mercedes() {
        super("Mercedes");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started from Mercedes class");
    }

    @Override
    public void brake() {
        System.out.println("Breaking from Mercedes class");
    }
}
