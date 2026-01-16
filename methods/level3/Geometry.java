/*
Question:
Write a program to find Euclidean distance between two points
and also find the equation of the line passing through them.

Hint =>
Distance formula:
sqrt((x2-x1)^2 + (y2-y1)^2)
Line equation: y = mx + b
*/

class Geometry {

    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3, x2 = 5, y2 = 7;

        System.out.println("Distance: " + findDistance(x1, y1, x2, y2));

        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
    }
}
