package student.validation.system;

import exception.handling.AgeNotWithinRangeException;
import exception.handling.NameNotValidException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n============= Student Registration =============");

        // Try-with-resources: Ensures scanner closes to prevent memory leaks
        try (sc) {
            // Data collection with buffer clearing (sc.nextLine()) after nextInt()
            System.out.print("Enter Roll no: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Course: ");
            sc.nextLine();
            String course = sc.nextLine();

            // Logic: Object creation may fail here and jump to catch block
            Student student = new Student(rollNo, name, age, course);
            student.display();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            // Multi-catch block: Handles different custom exceptions in one place
            System.out.println("Student Registration Failed: " + e.getMessage());
        }
    }
}