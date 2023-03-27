package academy.learnprogramming;

import java.util.Scanner;

public class Descend {

    final private static int MAX_INTEGER = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] values = getIntegers(MAX_INTEGER);

        int[] sorted = descendArray(values);
        System.out.println(sorted[0]);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + MAX_INTEGER + " integer values: \r");

        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] descendArray(int[] array) {

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return array;
    }


}
