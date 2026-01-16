/*
Multilevel Inheritance - Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
1) Define a base class Order with common attributes like orderId and orderDate.
2) Create a subclass ShippedOrder with additional attributes like trackingNumber.
3) Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
4) Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/

class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order o1 = new Order("ORD001", "2026-01-10");
        ShippedOrder o2 = new ShippedOrder("ORD002", "2026-01-11", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("ORD003", "2026-01-12", "TRK98765", "2026-01-14");

        System.out.println("ORD001 Status: " + o1.getOrderStatus());
        System.out.println("ORD002 Status: " + o2.getOrderStatus());
        System.out.println("ORD003 Status: " + o3.getOrderStatus());
    }
}
