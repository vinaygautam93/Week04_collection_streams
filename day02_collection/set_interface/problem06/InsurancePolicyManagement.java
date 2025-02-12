package com.day02_collection.set_interface.problem06;

import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String holderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String holderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Compare policies by expiry date (for TreeSet)
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy other = (Policy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public String toString() {
        return policyNumber + " - " + holderName + " (" + coverageType + ")";
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        // HashSet for quick lookups
        Set<Policy> policyHashSet = new HashSet<>();

        // LinkedHashSet to maintain order of insertion
        Set<Policy> policyLinkedHashSet = new LinkedHashSet<>();

        // TreeSet to maintain sorting order by expiry date
        Set<Policy> policyTreeSet = new TreeSet<>();

        // Adding policies
        policyHashSet.add(new Policy("P001", "Alice", new Date(2025, 5, 10), "Health", 5000));
        policyHashSet.add(new Policy("P002", "Bob", new Date(2025, 3, 15), "Auto", 3000));

        policyLinkedHashSet.addAll(policyHashSet);
        policyTreeSet.addAll(policyHashSet);

        // Display all unique policies
        System.out.println("Unique Policies:");
        for (Policy p : policyHashSet) {
            System.out.println(p);
        }

        // Policies expiring soon (within 30 days)
        Date today = new Date();
        System.out.println("\nPolicies expiring soon:");
        for (Policy p : policyTreeSet) {
            long diff = p.expiryDate.getTime() - today.getTime();
            if (diff <= (30L * 24 * 60 * 60 * 1000)) {
                System.out.println(p);
            }
        }
    }
}
