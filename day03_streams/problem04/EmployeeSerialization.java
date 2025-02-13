package com.day03_streams.problem04;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name, department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + department + " | $" + salary);
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "IT", 60000));
        employees.add(new Employee(102, "Bob", "HR", 50000));

        String fileName = "employees.dat";

        // Serialize (Save employees)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
            System.out.println("Employees saved to file!");
        } catch (IOException e) {
            System.out.println("Error: Unable to save employees.");
        }

        // Deserialize (Retrieve employees)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Employee> loadedEmployees = (List<Employee>) ois.readObject();
            System.out.println("Employees retrieved from file:");
            for (Employee e : loadedEmployees) e.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: Unable to load employees.");
        }
    }
}
