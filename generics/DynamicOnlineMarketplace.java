/*
Problem Statement: Dynamic Online Marketplace

Concepts:
Type Parameters, Generic Methods, Bounded Type Parameters

Objective:
Build a generic product catalog supporting different product categories
with type-safe discount application.
*/

abstract class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    abstract String getCategory();

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class Book extends Product {
    Book(double price) {
        super(price);
    }

    String getCategory() {
        return "Book";
    }
}

class Clothing extends Product {
    Clothing(double price) {
        super(price);
    }

    String getCategory() {
        return "Clothing";
    }
}

public class DynamicOnlineMarketplace {

    public static <T extends Product> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println(
            product.getCategory() + " final price: " + product.price
        );
    }

    public static void main(String[] args) {
        Book book = new Book(500);
        Clothing clothing = new Clothing(1000);

        applyDiscount(book, 10);
        applyDiscount(clothing, 20);
    }
}
