package academy.learnprogramming;

import java.util.*;

public class DemoLinkedList {

    public static void main(String[] args) {

        LinkedList<String> letters = new LinkedList<String>();

        letters.add("A");
        letters.add("B");
        letters.add("D");
        letters.add("E");
        letters.add("F");

        printCurrentInfo(letters);
    }

    public static void addInOrder(String newLetter, LinkedList<String> list) {
        ListIterator<String> i = list.listIterator();

        while(i.hasNext()) {
            String currentLetter = i.next();
            int comparison = currentLetter.compareTo(newLetter);
            if(comparison == 0) {
                System.out.println("Letter " + newLetter + " already exists");
               return;
            } else if(comparison > 0) {
                System.out.println(newLetter + " should be before " + i.previous());
                i.previous();
                i.add(newLetter);
                return;
            }
        }
        System.out.println(newLetter + " should be last");
        list.addLast(newLetter);
    }

    public static void printList(LinkedList<String> list) {
        for (String s : list) {
            System.out.println("Currently at: " + s);
        }
        System.out.println();

    }

    public static void printMenu() {
        System.out.println("Available options: \n");
        System.out.println("0 - quit \n" +
                        "1 - go to next letter\n" +
                "2 - go to previous letter\n" +
                "3 - print menu"
                );
    }

    public static void printCurrentInfo(LinkedList<String> list) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> i = list.listIterator();

        if(list.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        System.out.println("Now currently at " + i.next());
        printMenu();

        while(!quit) {
            System.out.println("Choose an option!\n");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Exiting");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(i.hasNext()) {
                            i.next();
                        }
                        goingForward = true;
                    }
                    if(i.hasNext()) {
                        System.out.println("Now currently at " + i.next());
                    } else {
                        System.out.println("End of list : press 3 to show menu options");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(i.hasPrevious()) {
                            i.previous();
                        }
                        goingForward = false;
                    }
                    if(i.hasPrevious()) {
                        System.out.println("Now currently at " + i.previous());
                    } else {
                        System.out.println("Start of list : press 3 to show menu options");
                        goingForward = false;

                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

}
