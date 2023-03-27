package com.section11.ex;

import java.util.Scanner;

public class X {

    public X() {}

    private final Scanner x = new Scanner(System.in);

    public void x() {
        System.out.println("Write any number");
        int x = this.x.nextInt();

        for(int i = 1; i <= 12; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }

    }

    public static void main(String[] args) {
        X x = new X();
        x.x();
    }
}
