package student.validation.system;

import exception.handling.AgeNotWithinRangeException;
import exception.handling.NameNotValidException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("\n============= Student Registration =============");
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
            Student student = new Student(rollNo, name, age, course);
            student.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Registration Failed: " + e.getMessage());
        }
    }
}
