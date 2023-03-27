package com.section9;

public class Parrot extends Bird implements CanFly {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }

}
