package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        start();
    }

    public static void start() {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printArray();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Enter a valid number!");
                    printInstructions();
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print grocery list");
        System.out.println("\t 2 - To add item");
        System.out.println("\t 3 - To modify item");
        System.out.println("\t 4 - To remove item");
        System.out.println("\t 5 - To search for item");
        System.out.println("\t 6 - To quit");
    }

    public static void addItem() {
        System.out.println("What would you like to add?");
        groceryList.addItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.println("What would you like to remove?");
        int itemPosition = groceryList.findItem(scanner.nextLine());
        if(itemPosition == -1) {
            return;
        }
        groceryList.removeItem(itemPosition);

    }

    public static void searchForItem() {
        System.out.println("What item would you like to search for?");
        String itemToSearchFor = scanner.nextLine();
        int itemPosition = groceryList.findItem(itemToSearchFor);
        if(itemPosition == -1) {
            return;
        }
        String item = groceryList.getItem(itemPosition);
        System.out.println(item + " is in cart!");
    }

    public static void modifyItem() {
        System.out.println("What item would you like to modify?");
        int itemPosition = groceryList.findItem(scanner.nextLine());
        if(itemPosition == -1) {
            return;
        }
        System.out.println("What is the new item?");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(itemPosition, newItem);
    }

    public static void newArrayList() {
        ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceries());
        // newArray.addAll(groceryList.getGroceries());
    }

}