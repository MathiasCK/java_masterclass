package com.section11;

 public class StaticTest {

    private static int numInstances = 0;
    private final String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
