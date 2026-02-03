package weekday.lookup;

import java.util.Scanner;

public class Main {
    /**
     * Main Entry Point:
     * Handles user interaction and exception management.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Try-with-resources: Automatically closes the Scanner object (sc)
        // to prevent memory leaks, even if an exception occurs.
        try(sc) {
            System.out.print("Enter any position (0-6): ");

            // Logic: Reads the integer from console.
            // If the user enters a non-integer, this will throw InputMismatchException.
            int position = sc.nextInt();

            Day day = new Day();
            day.printDayName(position);

        } catch(ArrayIndexOutOfBoundsException e) {
            // Logic: This block intercepts the specific "Unchecked Exception"
            // thrown when the index is less than 0 or greater than 6.
            System.out.println("Unchecked Exception: Please enter a number between 0 and 6.");
        }
    }
}