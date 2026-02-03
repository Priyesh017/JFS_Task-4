package student.validation.system;

import exception.handling.AgeNotWithinRangeException;
import exception.handling.NameNotValidException;

final class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    // Table formatting: ensures clean column alignment for display
    String format = "%-10s %-25s %-25s %-10s%n";

    /**
     * Constructor Logic:
     * Implements "Guard Clauses" to validate data before assignment.
     * @throws AgeNotWithinRangeException if age is not in [15, 21].
     * @throws NameNotValidException if name contains numbers/symbols.
     */
    Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        // Age Validation Logic
        if(age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21");
        }

        // Name Validation Logic: Uses Regex to allow only letters and spaces
        if(!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name cannot contain any number or special symbols");
        }

        // Assignment occurs only if all exceptions are avoided
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display Students in Tabular Format
    void display() {
        System.out.println("Student Registration Successful");
        System.out.printf(format, "Roll No", "Name", "Age", "Course");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf(format, rollNo, name, age, course);
    }
}