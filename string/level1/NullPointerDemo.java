/*
Question:
Write a program to demonstrate NullPointerException.

Hint:
- Initialize String variable to null
- Call a String method to generate exception
- Handle exception using try-catch
*/

class NullPointerDemo {

    // Method that generates exception
    public static void generateException() {
        String text = null;
        text.length(); // Causes NullPointerException
    }

    // Method that handles exception
    public static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {

        // generateException();  // Uncomment to see abrupt stop
        handleException();
    }
}
