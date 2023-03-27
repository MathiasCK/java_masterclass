package ex.section8;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        reverse(new int[] {11, 22, 33, 44});
    }

    public static void reverse(int[] array) {

        System.out.println(Arrays.toString(array));

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

        System.out.println(Arrays.toString(array));
    }
}
