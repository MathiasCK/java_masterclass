package academy.learnprogramming;

import java.util.Scanner;

public class ArrayIntro {

    final private static int MAX_INTEGER = 10;
    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers();

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(i + " : " + myArray[i]);
        }

        System.out.println("Average was: " + getAverage(myArray));
    }

    public static int[] getIntegers() {
        System.out.println("Enter " + MAX_INTEGER + " integer values: \r");

        int[] values = new int[MAX_INTEGER];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {

        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
