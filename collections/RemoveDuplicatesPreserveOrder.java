/*
Problem: Remove duplicates while preserving order.
Input: [3,1,2,2,3,4]
Output: [3,1,2,4]
*/

import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(new ArrayList<>(set));
    }
}
