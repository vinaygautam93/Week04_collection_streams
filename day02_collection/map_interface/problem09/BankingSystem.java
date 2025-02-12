package com.day02_collection.map_interface.problem09;

import java.util.*;

class BankingSystem {
    // HashMap to store account numbers and balances
    Map<String, Double> accounts = new HashMap<>();
    // TreeMap to sort accounts by balance in ascending order
    TreeMap<Double, String> sortedByBalance = new TreeMap<>();
    // Queue to process withdrawal requests
    Queue<String> withdrawalQueue = new LinkedList<>();

    // Method to add a new account with an initial balance
    public void addAccount(String accountNumber, double balance) {
        // Store the account number and balance in HashMap
        accounts.put(accountNumber, balance);
        // Add the account to TreeMap to sort by balance
        sortedByBalance.put(balance, accountNumber);
    }

    // Method to request a withdrawal from an account
    public void requestWithdrawal(String accountNumber) {
        // Add the account to the withdrawal queue
        withdrawalQueue.add(accountNumber);
    }

    // Method to process all withdrawal requests in the order they were received
    public void processWithdrawals() {
        // Process the withdrawal queue
        while (!withdrawalQueue.isEmpty()) {
            String account = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + account);
        }
    }

    // Method to display account balances and sorted list by balance
    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
        System.out.println("Sorted by Balance: " + sortedByBalance);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        // Adding some accounts
        bank.addAccount("A101", 5000);
        bank.addAccount("A102", 7000);
        // Requesting withdrawal
        bank.requestWithdrawal("A101");
        // Processing withdrawals
        bank.processWithdrawals();
        // Displaying account balances
        bank.displayAccounts();
    }
}
