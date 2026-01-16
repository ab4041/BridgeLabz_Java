/*
Question:
Create a program to find the bonuses of employees based on their years of service.

Hint:
- Take salary and years of service as input
- If years of service is more than 5, give a bonus of 5%
- Print the bonus amount
*/

import java.util.Scanner;

// Class to calculate employee bonus
class EmployeeBonusCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take salary and years of service input
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Initialize bonus variable
        double bonusAmount = 0.0;

        // Check eligibility for bonus
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
        }

        // Print bonus amount
        System.out.println("Bonus Amount: " + bonusAmount);

        // Close scanner
        input.close();
    }
}
