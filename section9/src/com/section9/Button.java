package com.section9;

import java.util.Scanner;

public class Button {

    private final String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        void onClick(String title);
    }

    private final static Scanner scanner = new Scanner(System.in);
    private final static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        });

        listen();
    }

    public static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
