package exception.handling;

/**
 * Custom Checked Exception.
 * By extending 'Exception', the compiler forces the programmer to handle this
 * using try-catch or 'throws' keyword.
 */
public class AgeNotValidException extends Exception {
    // Passes the error message to the parent Exception class constructor
    public AgeNotValidException(String message) {
        super(message);
    }
}