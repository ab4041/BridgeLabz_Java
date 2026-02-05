/*
Problem Statement: Smart Warehouse Management System

Concepts:
Generic Classes, Bounded Type Parameters, Wildcards

Objective:
Manage different types of warehouse items like Electronics, Groceries,
and Furniture while maintaining type safety.

Approach:
- Create an abstract class WarehouseItem.
- Create subclasses Electronics, Groceries, Furniture.
- Implement a generic Storage<T extends WarehouseItem>.
- Use wildcard (? extends WarehouseItem) to display items.
*/

import java.util.*;

abstract class WarehouseItem {
    abstract String getName();
}

class Electronics extends WarehouseItem {
    public String getName() {
        return "Electronics Item";
    }
}

class Groceries extends WarehouseItem {
    public String getName() {
        return "Groceries Item";
    }
}

class Furniture extends WarehouseItem {
    public String getName() {
        return "Furniture Item";
    }
}

class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagementSystem {

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics());

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries(
