/*
Question:
Write a program to check whether three points are collinear.

Hint =>
Points are collinear if area of triangle = 0
Area = 0.5 * (x1(y2-y3) + x2(y3-y1) + x3(y1-y2))
*/

class CollinearPoints {

    public static boolean isCollinear(double x1, double y1,
                                      double x2, double y2,
                                      double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        System.out.println(isCollinear(2,4,4,6,6,8));
    }
}
