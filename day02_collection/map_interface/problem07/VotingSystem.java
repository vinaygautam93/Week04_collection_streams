package com.day02_collection.map_interface.problem07;

import java.util.*;

class VotingSystem {
    // HashMap to store the votes for each candidate
    Map<String, Integer> votes = new HashMap<>();
    // TreeMap to display results in sorted order based on candidate names
    Map<String, Integer> sortedVotes = new TreeMap<>();
    // LinkedHashMap to maintain the insertion order of votes
    Map<String, Integer> voteOrder = new LinkedHashMap<>();

    // Method to cast a vote for a candidate
    public void vote(String candidate) {
        // Update the vote count for the candidate
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        // Record the order in which the votes are cast
        voteOrder.put(candidate, votes.get(candidate));
        // Add the candidate to the sorted map based on vote count
        sortedVotes.put(candidate, votes.get(candidate));
    }

    // Method to display results
    public void displayResults() {
        // Display the votes sorted by candidate name
        System.out.println("Votes (Sorted Order): " + sortedVotes);
        // Display the votes in the order they were received
        System.out.println("Votes (Insertion Order): " + voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        // Casting votes
        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");

        // Displaying the results
        system.displayResults();
    }
}
