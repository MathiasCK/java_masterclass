package com.section9.ex;

public class CustomList implements NodeList {
    private ListItem root = null;

    public CustomList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if(comparison < 0) {
                // greater move right if possible
                if(currentItem.moveToNext() != null) {
                    currentItem = currentItem.moveToNext();
                } else {
                    // no next, insert to end of list
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            }

            if(comparison > 0) {
                // item is less, insert before
                if(currentItem.moveToPrevious() != null) {
                    currentItem.moveToPrevious().setNext(item).setPrevious(currentItem.moveToPrevious());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    // previous node is the root
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            }
            else {
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // if (item != null) {
        //     System.out.println("Deleting item " + item.getValue());
        // }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.moveToNext();
                } else {
                    currentItem.moveToPrevious().setNext(currentItem.moveToNext());
                    if (currentItem.moveToNext() != null) {
                        currentItem.moveToNext().setPrevious(currentItem.moveToPrevious());
                    }
                }
                return true;
            } else if (comparison < 0) {

                currentItem = currentItem.moveToNext();
            } else { // comparison > 0
                System.out.println("Sorry could not find " + item.getValue() + " in the list!");
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }

        // We have reached the end of the list
        // Without finding the item to delete
        return false;
    }

    @Override
    public void displayList(ListItem root) {
        if(root == null) {
            System.out.println("List is empty!");
            return;
        }
        while(root != null) {
            System.out.println(root.getValue());
            root = root.moveToNext();
        }
    }
}
