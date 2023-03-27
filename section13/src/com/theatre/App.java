package com.theatre;

import com.theatre.Theatre;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("com.theatre.Theatre", 8, 12);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());

        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        printList(priceSeats);
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(seat.getSeatNumber() + " $" + seat.getPrice() + " ");
        }
        System.out.println();
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

}