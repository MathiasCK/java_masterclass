package academy.learnprogramming;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        return ((int)num1 == (int)num2);
    }
}
