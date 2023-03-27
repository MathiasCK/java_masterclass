package academy.learnprogramming;

public class RoomColor {

    private int red;
    private int blue;
    private int green;

    public RoomColor(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public void getRoomColor() {
        System.out.println("The room color is: rgb("+ red +"," + blue +"," + green + ")");
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }
}
