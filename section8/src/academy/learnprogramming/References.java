package academy.learnprogramming;

import java.util.Arrays;

public class References {

    public static void main(String[] args) {

        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        anotherArray = new int[] {4, 5, 6};
        modifyArray(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
    }
}
