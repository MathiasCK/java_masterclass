package com.section9.ex;

public abstract class ListItem {

    protected Object value;
    protected ListItem itemToRight = null;
    protected ListItem itemToLeft = null;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem moveToNext();
    public abstract ListItem setNext(ListItem item);

    public abstract ListItem moveToPrevious();
    public abstract ListItem setPrevious(ListItem item);

    public abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
