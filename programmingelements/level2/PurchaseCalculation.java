/*
Question:
Write a program to input the unit price of an item and the quantity
to be bought. Then, calculate the total price.

I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___
       and unit price is INR ___
*/

import java.util.Scanner;

// Class to calculate purchase amount
class PurchaseCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read unit price and quantity
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        input.close();
    }
}
