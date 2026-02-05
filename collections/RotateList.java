/*
Problem: Rotate elements of a list by K positions.
Input: [10,20,30,40,50], K=2
Output: [30,40,50,10,20]
*/

import java.util.*;

public class RotateList {

    public static List<Integer> rotate(List<Integer> list, int k) {
        k = k % list.size();
        List<Integer> result = new ArrayList<>();

        result.addAll(list.subList(k, list.size()));
        result.addAll(list.subList(0, k));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        System.out.println(rotate(list, 2));
    }
}
