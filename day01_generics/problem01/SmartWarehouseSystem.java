package com.day01_generics.problem01;

import java.util.ArrayList;
import java.util.List;

// Generic Storage class that can store only WarehouseItem or its subclasses
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    // Method to add an item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to display all items in storage
    public void showItems() {
        for (T item : items) {
            System.out.println(item.getName() + " - " + item.getClass().getSimpleName());
        }
    }
}

// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Subclasses representing different item categories
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}

// Main class to test the functionality
public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Creating storage for different types of warehouse items
        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Milk"));
        groceryStorage.addItem(new Groceries("Bread"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Sofa"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying stored items
        System.out.println("Electronics Storage:");
        electronicStorage.showItems();

        System.out.println("\nGroceries Storage:");
        groceryStorage.showItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.showItems();
    }
}
