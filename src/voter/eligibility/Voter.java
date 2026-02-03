package voter.eligibility;

import exception.handling.AgeNotValidException;

/**
 * Final class prevents inheritance, protecting the voter validation logic.
 */
final class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    // Format string for tabular output: left-aligned columns
    String format = "%-10s %-25s %-25s%n";

    /**
     * Constructor logic:
     * Validates age BEFORE assigning values to the object.
     * @throws AgeNotValidException if age is less than 18.
     */
    Voter(int voterId, String name, int age) throws AgeNotValidException {
        if(age < 18) {
            // Logic: Throwing the custom exception halts object creation
            throw new AgeNotValidException("Invalid age for Voter");
        }

        // Assignment only happens if validation passes
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    /**
     * Display logic:
     * Prints a formatted table showing the successful voter registration.
     */
    void display() {
        System.out.println("Voter Eligibility Successful");
        System.out.printf(format, "Voter ID", "Name", "Age");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf(format, voterId, name, age);
    }
}