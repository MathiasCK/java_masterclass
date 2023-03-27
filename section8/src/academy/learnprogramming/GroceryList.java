package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    private final ArrayList<String> groceries = new ArrayList<String>();

    public void addItem(String item) {
        groceries.add(item);
    }

    public ArrayList<String> getGroceries() {
        return groceries;
    }

    public void modifyItem(int position, String newItem) {
        String oldItem = groceries.get(position);
        groceries.set(position, newItem);
        System.out.println(oldItem + " has been changed to " + groceries.get(position));
    }

    public void removeItem(int position) {
        String item = groceries.get(position);
        groceries.remove(position);
        System.out.println("Item " + item + " has ben removed");
    }

    public String getItem(int position) {
        return groceries.get(position);
    }

    public int findItem(String item) {
        boolean exists = groceries.contains(item);
        if(!exists) {
            System.out.println(item + " is not in list!");
            return -1;
        }
        int position = groceries.indexOf(item);
        return position;
    }

    public void printArray() {
        String arrayToString = groceries.toString();

        arrayToString
                = arrayToString.replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .replace(",", ", ");
        System.out.println("There are currently " + groceries.size() + " items in your cart: " + arrayToString);

    }


}


