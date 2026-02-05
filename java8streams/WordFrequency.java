import java.util.*;
import java.util.stream.Collectors;

/*
Problem:
Find most frequent and second most frequent words
*/

public class WordFrequency {

    public static void main(String[] args) {

        String text = "java java streams lambda java streams";

        Map<String, Long> frequency =
                Arrays.stream(text.split("\\s+"))
                      .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        frequency.entrySet().stream()
                 .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                 .limit(2)
                 .forEach(System.out::println);
    }
}
