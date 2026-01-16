/*
6. Online Food Delivery System
Description: Create an online food delivery system:
- Define an abstract class FoodItem with fields like itemName, price, and quantity.
- Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
- Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges.
- Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
- Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items.
*/

import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty())
            throw new IllegalArgumentException("Item name cannot be empty");
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) { // ✅ allowed update but validated
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be > 0");
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: 10%";
    }
}

class NonVegItem extends FoodItem {
    private double nonVegExtraCharge = 50; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (nonVegExtraCharge * getQuantity());
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "NonVeg Discount: 5%";
    }
}

public class Main6_FoodDelivery {
    public static void processOrder(List<FoodItem> order) {
        double grandTotal = 0;

        System.out.println("---- Order Summary ----");
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = item.applyDiscount();
            double finalAmt = total - discount;

            System.out.println("Total: " + total + " | Discount: " + discount + " (" + item.getDiscountDetails() + ")" +
                    " | Final: " + finalAmt);
            System.out.println("----------------------------------");

            grandTotal += finalAmt;
        }

        System.out.println("Grand Total Payable: " + grandTotal);
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 220, 2));
        order.add(new NonVegItem("Chicken Biryani", 260, 1));

        processOrder(order);
    }
}
