import java.io.IOException;

/*
Problem Statement:
Method throws both checked and unchecked exceptions
*/

public class MixedExceptionExample {

    static void processData(boolean fail) throws IOException {

        if (fail) {
            throw new IOException("Checked exception occurred");
        }

        if (!fail) {
            throw new RuntimeException("Unchecked exception occurred");
        }
    }

    public static void main(String[] args) {

        try {
            processData(true);

        } catch (IOException e) {
            System.out.println("Handled checked exception");

        } catch (RuntimeException e) {
            System.out.println("Handled unchecked exception");
        }
    }
}
