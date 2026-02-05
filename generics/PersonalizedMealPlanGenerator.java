/*
Problem Statement: Personalized Meal Plan Generator

Concepts:
Generic Methods, Type Parameters, Bounded Type Parameters

Objective:
Generate valid meal plans dynamically using generics.
*/

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class Meal<T extends MealPlan> {
    private final T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

public class PersonalizedMealPlanGenerator {

    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.println("Generated: " + meal.getMeal().getMealType());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());

        generateMeal(vegMeal);
        generateMeal(veganMeal);
    }
}
