package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Boat");
        System.out.println(vehicle.getType());

        System.out.println("********");

        Car car = new Car(4, 4,false, true);
        System.out.println(car.steer(2));
        System.out.println(car.shiftGears(5));

        System.out.println("********");

        Tesla tesla = new Tesla("Black", "Model 3");
        System.out.println(tesla.shiftGears(5));
        System.out.println(tesla.steer(5));
        System.out.println(tesla.getDirection());

        System.out.println("********");

        Audi audi = new Audi(false, false, "Blue", "A4");
        System.out.println(audi.shiftGears(4));
        System.out.println(audi.steer(7));
        System.out.println(audi.getDirection());

        System.out.println("********");
    }
}
