/*
2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
- Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
- Extend it into concrete classes: Electronics, Clothing, and Groceries.
- Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
- Use encapsulation to protect product details, allowing updates only through setter methods.
- Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/

import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    // ✅ Encapsulation + validation
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if (productId == null || productId.trim().isEmpty())
            throw new IllegalArgumentException("Product ID cannot be empty");
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 5%";
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class Main2_ECommerce {
    // ✅ Polymorphic method
    public static void printFinalPrice(Product p) {
        double tax = 0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }

        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;

        System.out.println(p.getName() + " | Base: " + p.getPrice() +
                " | Tax: " + tax +
                " | Discount: " + discount +
                " | Final: " + finalPrice);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("P1", "Laptop", 60000));
        products.add(new Clothing("P2", "Jacket", 2500));
        products.add(new Groceries("P3", "Rice", 1200));

        System.out.println("---- Final Price Calculation ----");
        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}
