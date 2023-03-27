package com.section9.ex;

public class AbstractChallenge {

    public static void main(String[] args) {

        CustomList todoList = new CustomList(null);
        todoList.displayList(todoList.getRoot());

        Node todo = new Node("Hello world");
        todoList.addItem(todo);

        todoList.removeItem(new Node("123"));

        todoList.displayList(todoList.getRoot());

    }
}
