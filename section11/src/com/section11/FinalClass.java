package com.section11;

public class FinalClass {

    private static int classCounter = 0;
    private final String name;
    public final int number;

    public FinalClass(String name) {
        this.name = name;
        classCounter++;
        this.number = classCounter;
        System.out.println(name + " created, instance is " + number);

    }

    public static void main(String[] args) {

        FinalClass one = new FinalClass("One");
        FinalClass two = new FinalClass("Two");
        FinalClass three = new FinalClass("Three");

    }
}
