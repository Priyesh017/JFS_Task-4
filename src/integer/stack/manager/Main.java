package integer.stack.manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate Scanner for user input and our IntegerStack object
        Scanner sc = new Scanner(System.in);
        IntegerStack stack = new IntegerStack();
        boolean running = true; // Control flag for the menu loop

        System.out.println("=== Interactive Integer Stack ===");

        // The loop keeps the program alive until the user chooses to exit (Choice 5)
        while (running) {
            System.out.println("\n1. Push (Add)\n2. Pop (Remove)\n3. Check if Empty\n4. Display Stack\n5. Exit");
            System.out.print("Enter choice: ");

            // Read choice. Note: if user enters non-integer, this will throw InputMismatchException.
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // PUSH logic: Gather integer and send to the stack object
                    System.out.print("Enter integer to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    // POP logic: Call pop and check for null before printing
                    Integer popped = stack.pop();
                    if (popped == null) {
                        System.out.println("Error: Cannot pop! The stack is empty.");
                    } else {
                        System.out.println("<<< Popped element: " + popped);
                    }
                    break;

                case 3:
                    // STATUS logic: Simple boolean check
                    if (stack.isEmpty()) {
                        System.out.println("The stack is currently EMPTY.");
                    } else {
                        System.out.println("The stack is NOT empty.");
                    }
                    break;

                case 4:
                    // DISPLAY logic: Print the current contents
                    stack.display();
                    break;

                case 5:
                    // EXIT logic: Flip the flag to terminate the while-loop
                    running = false;
                    System.out.println("Exited");
                    break;

                default:
                    // ERROR logic: Handle numbers outside 1-5
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }
        sc.close(); // Close the resource to prevent memory leaks
    }
}