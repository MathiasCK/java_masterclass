package com.section9.ex;

import java.util.ArrayList;
import java.util.List;

public class Item implements ISavable<String> {

    private final List<String> items = new ArrayList<String>();

    @Override
    public void displayItems() {
        this.items.forEach(System.out::println);
    }

    @Override
    public void add(String input) {
        this.items.add(input);
    }

}
