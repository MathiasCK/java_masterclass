package academy.learnprogramming;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        double result = kilometersPerHour / 1.609;
        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        double result = kilometersPerHour / 1.609;
        System.out.println(kilometersPerHour + " km/h = " + Math.round(result) + " mi/h");

    }
}
