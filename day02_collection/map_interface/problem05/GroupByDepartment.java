package com.day02_collection.map_interface.problem05;

import java.util.*;

class Employee {
    String name, department;

    // Constructor to initialize employee details
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Overriding toString() for easy printing of employee names
    public String toString() {
        return name;
    }
}

class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        // Map to store department-wise employee lists
        Map<String, List<Employee>> grouped = new HashMap<>();

        // Loop through each employee and add them to their respective department
        for (Employee emp : employees) {
            // If the department is not already in the map, add it with an empty list
            grouped.putIfAbsent(emp.department, new ArrayList<>());

            // Add the employee to the correct department list
            grouped.get(emp.department).add(emp);
        }
        return grouped;
    }

    public static void main(String[] args) {
        // Creating a sample list of employees
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT")
        );

        // Grouping employees by department
        Map<String, List<Employee>> result = groupByDept(employees);

        // Printing the grouped result
        for (Map.Entry<String, List<Employee>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
