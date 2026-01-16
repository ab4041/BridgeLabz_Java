/*
Question:
Create a program to find the bonus of 10 employees based on years of service
and calculate total bonus, total old salary, and total new salary.

Hint:
- Bonus = 5% if years > 5 else 2%
- Validate salary and years of service
*/

import java.util.Scanner;

// Class to calculate employee bonuses
class EmployeeBonusCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int employeeCount = 10;

        double[] salary = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salary and years of service
        for (int i = 0; i < employeeCount; i++) {

            System.out.println("Enter salary and years of service for employee " + (i + 1));
            salary[i] = input.nextDouble();
            yearsOfService[i] = input.nextDouble();

            // Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid input. Enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < employeeCount; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
