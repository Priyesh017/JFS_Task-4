package student.grade.tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeBook gb = new GradeBook();
        boolean running = true;

        System.out.println("Welcome to the Student Grade System!");
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    gb.addStudent(nameAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameRemove = sc.nextLine();
                    gb.removeStudent(nameRemove);
                    break;
                case 4:
                    gb.displayAllStudents();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}