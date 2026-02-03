package exception.handling;

/**
 * Custom Checked Exception for Age validation.
 * Triggers if the age falls outside the defined range (15-21).
 */
public class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) { super(message); }
}