package com.day06_annotations_reflection.annotations_problem.use_override;

// Base class Animal with a method makeSound()
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Dog class overrides makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Testing the override functionality
public class OverrideExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Expected output: Bark! Bark!
    }
}
