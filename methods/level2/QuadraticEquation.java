/*
Question:
Write a program Quadratic to find the roots of the equation ax^2 + bx + c.

Hint =>
delta = b^2 - 4ac
Use Math.pow() and Math.sqrt()
Return empty array if delta < 0
*/

import java.util.Scanner;

class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return new double[0];
        }

        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            for (double root : roots) {
                System.out.println("Root: " + root);
            }
        }

        input.close();
    }
}
