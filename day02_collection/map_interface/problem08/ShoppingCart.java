package com.day02_collection.map_interface.problem08;

import java.util.*;

class ShoppingCart {
    // HashMap to store the product and its price
    Map<String, Double> prices = new HashMap<>();
    // LinkedHashMap to maintain the order in which items were added
    Map<String, Double> orderedItems = new LinkedHashMap<>();
    // TreeMap to display items sorted by price
    TreeMap<Double, String> sortedByPrice = new TreeMap<>();

    // Method to add a product to the cart
    public void addItem(String product, double price) {
        // Add the product and its price to the HashMap
        prices.put(product, price);
        // Record the product in the LinkedHashMap to maintain insertion order
        orderedItems.put(product, price);
        // Add the product to TreeMap, which will automatically sort by price
        sortedByPrice.put(price, product);
    }

    // Method to display the cart with products sorted by their insertion order and price
    public void displayCart() {
        System.out.println("Cart (Original Order): " + orderedItems);
        System.out.println("Cart (Sorted by Price): " + sortedByPrice);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // Adding items to the shopping cart
        cart.addItem("Laptop", 1000);
        cart.addItem("Phone", 800);
        cart.addItem("Tablet", 600);

        // Displaying the cart contents
        cart.displayCart();
    }
}
