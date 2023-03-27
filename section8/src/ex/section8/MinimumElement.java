package ex.section8;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = readIntegers(5);
        findMin(array);

    }

    public static int[] readIntegers(int count) {

        System.out.println("Please enter " + count + " integers: ");
        int[] array = new int[count];

        for(int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Array: " + Arrays.toString(array));
        return array;

    }

    public static int findMin(int array[]) {

        int value = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < value) {
                value = array[i];

            }
        }
        System.out.println("Smallest value was: " + value);
        return value;
    }
}
