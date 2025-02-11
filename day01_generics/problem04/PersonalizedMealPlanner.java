package com.day01_generics.problem04;

import java.util.ArrayList;
import java.util.List;

// Generic Meal class restricted to MealPlan types
class Meal<T extends MealPlan> {
    private String mealName;
    private T mealType;

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }

    public void showMealDetails() {
        System.out.println(mealName + " - Type: " + mealType.getMealType());
    }
}

// Interface for meal types
interface MealPlan {
    String getMealType();
}

// Different meal plan implementations
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein Meal";
    }
}

// Meal Plan Generator with a generic method
class MealPlanGenerator {
    public static void generatePlan(List<? extends Meal<? extends MealPlan>> meals) {
        System.out.println("\nGenerating Personalized Meal Plan...");
        for (Meal<? extends MealPlan> meal : meals) {
            meal.showMealDetails();
        }
    }
}

// Main class to test the meal plan system
public class PersonalizedMealPlanner {
    public static void main(String[] args) {
        // Creating different meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>("Grilled Paneer Salad", new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>("Tofu Stir Fry", new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>("Avocado & Chicken", new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>("Egg & Tuna Salad", new HighProteinMeal());

        // Storing meals in a list
        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();
        mealPlans.add(vegMeal);
        mealPlans.add(veganMeal);
        mealPlans.add(ketoMeal);
        mealPlans.add(proteinMeal);

        // Generating the personalized meal plan
        MealPlanGenerator.generatePlan(mealPlans);
    }
}
