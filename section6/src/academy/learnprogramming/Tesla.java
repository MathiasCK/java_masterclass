package academy.learnprogramming;

public class Tesla extends Car {

    private String color;
    private String model;

    public Tesla(String color, String model) {
        super(4, 4, true, false);
        this.color = color;
        this.model = model;
    }

    @Override
    public int steer(int direction) {
        System.out.println("Tesla is steering to " + direction);
        return super.steer(direction);
    }

    @Override
    public String shiftGears(int gear) {
        return "A tesla cannot shift gears";
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
