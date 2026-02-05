import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> s1 = Set.of(2, 3);
        Set<Integer> s2 = Set.of(1, 2, 3, 4);
        System.out.println(s2.containsAll(s1));
    }
}
