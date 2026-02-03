package student.grade.tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeBook gb = new GradeBook();
        boolean running = true;

        System.out.println("=== Student Grade Tracker Console ===");

        while (running) {
            System.out.println("\nOptions: [1] Add  [2] Remove  [3] Search  [4] View All  [5] Exit");
            System.out.print("Select choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear newline buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    gb.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    gb.removeStudent(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    gb.displayGradeByName(sc.nextLine());
                    break;
                case 4:
                    gb.displayAll();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid entry.");
            }
        }
        sc.close();
    }
}