package academy.learnprogramming;

public class Triangle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Triangle() {
        this(0,0);
    }


    public Triangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Triangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
