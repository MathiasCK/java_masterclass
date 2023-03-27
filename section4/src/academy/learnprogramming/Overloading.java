package academy.learnprogramming;

public class Overloading {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final int INVALID_INPUT = -1;

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(25));
        System.out.println(calcFeetAndInchesToCentimeters(2, 1));

        System.out.println(getDurationString(185, 33));
        System.out.println(getDurationString(1000000));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || !(inches >= 0 && inches <= 12 )) return INVALID_INPUT;

        double feetToInches = feet * 12;
        return (inches + feetToInches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) return INVALID_INPUT;

        double feet = (int)inches / 12;
        double remainingInches = (int)inches % 12;


        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || !(seconds >= 0 && seconds <= 59)) return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        int restMinutes = minutes % 60;

        return addZeroIfLessThan10(hours) + "h " + addZeroIfLessThan10(restMinutes) + "m " + addZeroIfLessThan10(seconds) + "s";
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        int restSeconds = seconds % 60;
        return getDurationString(minutes, restSeconds);
    }

    public static String addZeroIfLessThan10(int input) {
        String returnString = input + "";
        if(input < 10) {
            returnString = "0" + input;
        }
        return returnString;
    }
}
