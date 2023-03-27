package com.section9.ex;

public class InterfaceChallenge {

    public static void main(String[] args) {

        ISavable<String> item;
        item = new Item();
        item.add("Hello");
        item.add("World");
        item.displayItems();

        ISavable<Integer> num;
        num = new Number();
        num.add(1);
        num.add(2);
        num.displayItems();

    }
}
