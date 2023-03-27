package academy.learnprogramming;

public class Lamp {

    private String color;
    private boolean isHue;

    public Lamp(String color, boolean isHue) {
        this.color = color;
        this.isHue = isHue;
    }

    public String getColor() {
        return color;
    }

    public boolean isHue() {
        return isHue;
    }

    public void getLampInfo() {
        String hue = isHue ? "is" : "is not";

        System.out.println("The lamp " + hue + " hue, and has a color of " + color);
    }


}
