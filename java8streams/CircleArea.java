import java.util.function.Function;

/*
Problem:
Calculate area of circle using Function
*/

public class CircleArea {

    public static void main(String[] args) {

        Function<Double, Double> area = r -> Math.PI * r * r;
        System.out.println("Area: " + area.apply(5.0));
    }
}
