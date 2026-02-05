import java.util.*;

/*
Problem:
Find max value using Optional
*/

public class OptionalMaxValue {

    public static void main(String[] args) {

        List<Integer> list = List.of();

        Optional<Integer> max = list.stream().max(Integer::compareTo);

        System.out.println(max.orElse("List is empty"));
    }
}
