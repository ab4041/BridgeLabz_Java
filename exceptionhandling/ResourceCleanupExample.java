/*
Problem Statement:
Demonstrate proper resource cleanup during exception handling
*/

class Connection {

    void open() {
        System.out.println("Connection opened");
    }

    void close() {
        System.out.println("Connection closed");
    }
}

public class ResourceCleanupExample {

    public static void main(String[] args) {

        Connection connection = new Connection();

        try {
            connection.open();
            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");

        } finally {
            // ensures cleanup happens always
            connection.close();
        }
    }
}
