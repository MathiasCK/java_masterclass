package com.section9;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Penguins cannot fly only swim");
    }

}
