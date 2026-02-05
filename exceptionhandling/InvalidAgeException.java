/*
Custom Exception:
Thrown when age is below 18
*/

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}
