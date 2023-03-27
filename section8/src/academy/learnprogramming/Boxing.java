package academy.learnprogramming;

import java.util.ArrayList;

public class Boxing {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(i);
        }

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double i = 0.0; i <= 10.0; i+= 0.5) {
            doubleArrayList.add(i);
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(integerArrayList.get(i).intValue());
            System.out.println(doubleArrayList.get(i).doubleValue());
        }
    }
}
