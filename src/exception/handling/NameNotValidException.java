package exception.handling;

/**
 * Custom Checked Exception for Name validation.
 * Triggers if the name contains non-alphabetic characters.
 */
public class NameNotValidException extends Exception {
    public NameNotValidException(String message) { super(message); }
}