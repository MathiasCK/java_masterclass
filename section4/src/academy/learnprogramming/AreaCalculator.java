package academy.learnprogramming;

public class AreaCalculator {

    private static final int INVALID_INPUT = -1;

    public static double area(double radius) {
        if (radius < 0) return INVALID_INPUT;

        return (float)(3.14 * (radius * radius));
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return INVALID_INPUT;

        return (float)(x * y);
    }
}
