package ex.section8;

import java.util.ArrayList;

public class MobilePhone {

    private final ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        Contact contactAlreadyExists = contacts.stream().filter(c -> c.getNumber().equals(contact.getNumber())).findFirst().orElse(null);
        if(contactAlreadyExists == null) {
            contacts.add(contact);
            System.out.println(contact.getName() + " : " + contact.getNumber() + " added to your contacts!");
            return;
        }
        System.out.println("A contact with the number " + contact.getNumber() + " saved under the name \"" + contactAlreadyExists.getName() + "\" already exists");
    }

    public void removeContact(String credential) {
        Contact contactToRemove = findContact(credential);
        contacts.remove(contactToRemove);
        System.out.println(contactToRemove.getName() + " : " + contactToRemove.getNumber() + " successfully removed from contacts!");
    }


    public Contact searchForContact(String credential) {
        Contact contactToFind = findContact(credential);
        System.out.println(contactToFind.getName() + " is in your contacts! Their number is " + contactToFind.getNumber());
        return contactToFind;
    }


    public Contact findContact(String credential) {
        Contact contactToFind = contacts.stream().filter(contact -> contact.getNumber().equals(credential) || contact.getName().equals(credential)).findFirst().orElse(null);
        if(contactToFind != null) {
            return contactToFind;
        }
        printError(credential);
        return null;
    }


    public void printError(String credential) {
        System.out.println("Error: there is no contact matching " + credential + " in your contacts!");
    }

    public void printArray() {
        System.out.println("Your contacts are: ");
        contacts.forEach(contact -> System.out.println(contact.getName() + " : " + contact.getNumber()));

    }

}
