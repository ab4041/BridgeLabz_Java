/*
Problem Statement:
Create a Product class with instance variables productName, price
and class variable totalProducts.
*/

class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println(productName + " - ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class Main {
    public static void main(String[] args) {
        new Product("Pen", 10);
        new Product("Book", 50);

        Product.displayTotalProducts();
    }
}
