/*
Problem Statement:
Catch and rethrow custom exception with additional transaction context
*/

public class TransactionProcessor {

    static void processTransaction(double amount) throws TransactionException {

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid transaction amount");
            }

            System.out.println("Transaction successful");

        } catch (IllegalArgumentException e) {
            throw new TransactionException("Transaction failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            processTransaction(-500);

        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
