package com.stocklist;

import java.util.Map;

public class App {

    private final static StockList stockList = new StockList();
    private final static Basket basket = new Basket("Basket");
    private final static Basket customerBasket = new Basket("Customer");
    private static StockItem temp = new StockItem();

    public static void main(String[] args) {
        addStockItems();

        System.out.println(stockList);

        sellItem(basket, "Car", 1);
        sellItem(basket, "Cup", 1);
        sellItem(basket, "Cake", 1);
        System.out.println(basket);

        removeItem(basket, "Cake", 1);
        System.out.println(basket);

        checkout(basket);
        System.out.println(stockList);


    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);

        if (stockItem == null) {
            throw new NullPointerException("We don't sell " + item);
        }

        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }

        System.out.println("\nThere are no more " + item + "s in stock");
        return 0;
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);

        if (stockItem == null) {
            throw new NullPointerException("We don't sell " + item);
        }

        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }

        System.out.println("\nThere are no more " + item + "s in stock");
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

    public static void addStockItems() {
        temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 23);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 17);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.99, 7);
        stockList.addStock(temp);
    }
}
