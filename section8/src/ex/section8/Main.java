package ex.section8;

import java.util.Scanner;

public class Main {

    final private static Scanner scanner = new Scanner(System.in);
    final private static MobilePhone contacts = new MobilePhone();

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
                    contacts.printArray();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
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
        System.out.println("\t 1 - To print contact list");
        System.out.println("\t 2 - To add contact");
        System.out.println("\t 3 - To modify contact");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - To search for contact");
        System.out.println("\t 6 - To quit");
    }

    public static void addContact() {
        Contact newContact = new Contact();
        System.out.println("What is the name of your contact?");
        newContact.setName(scanner.nextLine());
        System.out.println("What is the phone number of your contact?");
        newContact.setNumber(scanner.nextLine());
        contacts.addContact(newContact);

    }

    public static void removeContact() {
        System.out.println("What is the number or name of your contact you would like to remove?");
        contacts.removeContact(scanner.nextLine());
    }

    public static void searchForContact() {
        System.out.println("What is the number or name of your contact you would like to find?");
        contacts.searchForContact(scanner.nextLine());
    }

    public static void modifyContact() {
        System.out.println("What is the number or name of your contact you would like to modify?");
        Contact contactToModify = contacts.searchForContact(scanner.nextLine());
        System.out.println("Would you like to modify \"name\" or \"number\"?");
        String modifyValue = scanner.nextLine();
        checkModifyValue(modifyValue, contactToModify);

    }
    public static void checkModifyValue(String value, Contact contact) {
        switch (value) {
            case "name":
              String oldName = contact.getName();
              System.out.println("What do you want the new name for " + oldName + " to be?");
              contact.setName(scanner.nextLine());
              System.out.println(oldName + " successfully changed to " + contact.getName());
              break;
            case "number":
              String oldNumber = contact.getNumber();
              System.out.println("What would you like " + oldNumber + " to be changed to?");
              contact.setNumber(scanner.nextLine());
              System.out.println(oldNumber + " successfully changed to " + contact.getNumber());
              break;
            default:
              System.out.println("Please select \"name\" or \"number\"!");
        }

    }
}
