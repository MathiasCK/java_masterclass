package com.section9.ex;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem moveToNext() {
        return this.itemToRight;
    }

    @Override
    public ListItem setNext(ListItem item) {
        return this.itemToRight = item;
    }

    @Override
    public ListItem moveToPrevious() {
        return this.itemToLeft;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        return this.itemToLeft = item;
    }

    @Override
    public int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }
}
