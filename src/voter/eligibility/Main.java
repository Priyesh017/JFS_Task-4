package voter.eligibility;

import exception.handling.AgeNotValidException;
import java.util.Scanner;

public class Main {
    /**
     * The main method serves as the entry point for the Voter Eligibility application.
     * It handles user input, object instantiation, and specific error reporting.
     */
    public static void main(String[] args) {
        // Initialize the Scanner to read data from the standard input stream (System.in)
        Scanner sc = new Scanner(System.in);

        System.out.println("\n============= Voter Eligibility =============");

        /**
         * Try-with-resources block:
         * This ensures that the Scanner 'sc' is closed automatically at the end of the block,
         * even if an exception is thrown. This is a best practice to prevent memory leaks.
         */
        try(sc) {
            // Step 1: Collect Voter ID (Integer)
            System.out.print("Enter Voter ID: ");
            int voterId = sc.nextInt();

            // Step 2: Collect Name (String)
            System.out.print("Enter Name: ");
            /**
             * BUFFER LOGIC:
             * sc.nextInt() leaves a 'newline' character in the buffer.
             * sc.nextLine() is used here to consume that leftover newline so the
             * actual 'Name' input prompt isn't skipped.
             */
            sc.nextLine();
            String name = sc.nextLine();

            // Step 3: Collect Age (Integer)
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            /**
             * OBJECT INSTANTIATION LOGIC:
             * When we call 'new Voter(...)', the constructor runs its internal validation.
             * If 'age < 18', the constructor throws AgeNotValidException.
             * In that case, the 'voter' object is NEVER fully created, and the code
             * immediately jumps to the 'catch' block, skipping 'voter.display()'.
             */
            Voter voter = new Voter(voterId, name, age);

            // This line only executes if the age validation inside the constructor passes.
            voter.display();

        } catch(AgeNotValidException e) {
            /**
             * EXCEPTION HANDLING LOGIC:
             * This block specifically catches the custom AgeNotValidException.
             * 'e.getMessage()' retrieves the specific error string passed
             * during the 'throw' statement in the Voter constructor.
             */
            System.out.println("Voter Eligibility Failed: " + e.getMessage());
        }
    }
}