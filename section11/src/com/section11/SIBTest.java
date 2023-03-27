package com.section11;

public class SIBTest {

    public static final String owner;

    static {
        owner = "Mathias";
        System.out.println("SIBTest called!");
    }

    public SIBTest() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Second call!");
    }

    public void method() {
        System.out.println("Method call");
    }

    public static void main(String[] args) {

        System.out.println("main called");
        SIBTest test = new SIBTest();
        test.method();
    }
}
