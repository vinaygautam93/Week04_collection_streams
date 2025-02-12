package com.day02_collection.map_interface.problem06;

import java.util.*;

class Policy {
    String policyNumber; // Unique policy ID
    String policyHolderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " + expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
}

class InsuranceSystem {
    // HashMap for quick lookup by policy number
    Map<String, Policy> policyMap = new HashMap<>();
    // LinkedHashMap to maintain insertion order
    Map<String, Policy> orderedPolicies = new LinkedHashMap<>();
    // TreeMap to store policies sorted by expiry date
    TreeMap<Date, Policy> sortedPolicies = new TreeMap<>();

    // Add a new policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicies.put(policy.policyNumber, policy);
        sortedPolicies.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring in the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiring = new ArrayList<>();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date next30Days = calendar.getTime();

        for (Date date : sortedPolicies.keySet()) {
            if (date.before(next30Days)) {
                expiring.add(sortedPolicies.get(date));
            }
        }
        return expiring;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date today = new Date();
        sortedPolicies.entrySet().removeIf(entry -> entry.getKey().before(today));
    }

    public static void main(String[] args) {
        InsuranceSystem system = new InsuranceSystem();

        system.addPolicy(new Policy("P101", "Alice", new Date(2025, 5, 10), "Health", 5000));
        system.addPolicy(new Policy("P102", "Bob", new Date(2025, 3, 15), "Auto", 3000));

        System.out.println("Expiring Policies: " + system.getExpiringPolicies());
    }
}
