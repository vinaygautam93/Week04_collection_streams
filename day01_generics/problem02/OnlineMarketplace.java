package com.day01_generics.problem02;

import java.util.ArrayList;
import java.util.List;

// Generic Product class with type T restricted to ProductCategory
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Generic method to apply discount on any product
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        double discount = product.price * (percentage / 100);
        product.price -= discount;
        System.out.println("Discount applied! New price of " + product.name + ": $" + product.price);
    }

    public void showProduct() {
        System.out.println(name + " - Category: " + category.getCategoryName() + " - Price: $" + price);
    }
}

// Abstract class for different product categories
abstract class ProductCategory {
    public abstract String getCategoryName();
}

// Subclasses for different product categories
class BookCategory extends ProductCategory {
    @Override
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory extends ProductCategory {
    @Override
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory extends ProductCategory {
    @Override
    public String getCategoryName() {
        return "Gadgets";
    }
}

// Main class to test the online marketplace
public class OnlineMarketplace {
    public static void main(String[] args) {
        // Creating different product objects
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 25.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 600.0, new GadgetCategory());

        // Displaying product details
        book.showProduct();
        shirt.showProduct();
        phone.showProduct();

        // Applying discount
        System.out.println("\nApplying Discount...");
        Product.applyDiscount(book, 10);
        Product.applyDiscount(phone, 15);
    }
}
