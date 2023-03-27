package com.section9;

public class Dragon extends Animal implements CanFly{
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing flames");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
