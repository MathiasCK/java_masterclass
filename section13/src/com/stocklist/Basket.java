package com.stocklist;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = list.getOrDefault(item, 0);
            this.list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if (newQuantity > 0) {
                this.list.put(item, newQuantity);
                return quantity;
            }
            else if (newQuantity == 0) {
                this.list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket() {
        this.list.clear();
    }

    public String getName() {
        return this.name;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(this.list);
    }

    @Override
    public String toString() {
        if (this.list.size() == 0) {
            return "Your basket is empty";
        }
        String s = "\nShopping basket " + name + " contains " + this.list.size() + (list.size() == 1 ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s += item.getKey() + "\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }

        return s + "Total cost " + totalCost;
    }
}
