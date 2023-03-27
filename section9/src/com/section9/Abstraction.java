package com.section9;

public class Abstraction {

    public static void main(String[] args) {

        Dog dog = new Dog("Dog");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.move();

        Dragon dragon = new Dragon("Dragon");
        dragon.eat();
        dragon.breathe();
        dragon.fly();

    }
}
