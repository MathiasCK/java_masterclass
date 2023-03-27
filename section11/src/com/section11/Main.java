package com.section11;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is the " + StaticTest.getNumInstances() + " time");

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is the " + StaticTest.getNumInstances() + " time");

        multiply(6);
    }

    public static int multiply(int num) {
        return num * multiplier;
    }

}
