package ex.section8;

import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int value) {

        System.out.println("Enter " + value + " integer values: \r");

        int[] values = new int[value];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println(values);
        return values;
    }

    public static void printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = array.clone();

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < newArray.length - 1; i++) {
                if(newArray[i] < newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
