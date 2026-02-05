/*
Problem Statement:
Retrieve an element from an array using index.
Handle:
- ArrayIndexOutOfBoundsException
- NullPointerException
*/

public class ArrayExceptionExample {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};
            int index = 5;

            System.out.println("Value: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
