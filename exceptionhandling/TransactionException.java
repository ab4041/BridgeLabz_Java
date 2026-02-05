/*
Custom exception for transaction failure
*/

public class TransactionException extends Exception {

    public TransactionException(String message) {
        super(message);
    }
}
