package com.section9.ex;

import java.util.ArrayList;
import java.util.List;

public class Number implements ISavable<Integer> {

    private final List<Integer> items = new ArrayList<Integer>();

    @Override
    public void displayItems() {
        this.items.forEach(System.out::println);

    }
    @Override
    public void add(Integer input) {
        this.items.add(input);
    }

}
