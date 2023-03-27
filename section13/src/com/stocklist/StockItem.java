package com.stocklist;

public class StockItem implements Comparable<StockItem> {

    private String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price) {
        this(name, price, 0);
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public StockItem() {}

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int availableQuantity() {
        return this.quantityInStock - this.reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        if (quantity <= availableQuantity()) {
            this.reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity) {
        if (quantity <= this.reserved) {
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if (quantity <= this.reserved) {
            this.quantityInStock -= quantity;
            this.reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException("Object cannot be null");
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". Reserved: " + this.reserved;
    }
}
