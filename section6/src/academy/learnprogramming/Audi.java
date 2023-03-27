package academy.learnprogramming;

public class Audi extends Car {

    private String color;
    private String model;

    public Audi(boolean isElectric, boolean isManual, String color, String model) {
        super(4, 4, isElectric, isManual);
        this.color = color;
        this.model = model;
    }

    @Override
    public int steer(int direction) {
        System.out.println("Audi is steering");
        return super.steer(direction);
    }

    @Override
    public String shiftGears(int gear) {
        System.out.println("Audi is shifting");
        return super.shiftGears(gear);
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
