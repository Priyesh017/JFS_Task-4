package student.validation.system;

import exception.handling.AgeNotWithinRangeException;
import exception.handling.NameNotValidException;

final class Student {
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    String format = "%-10s %-25s %-25s %-10s%n";

    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if(age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21");
        }

        if(!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name cannot contain any number or special symbols");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Student Registration Successful");
        System.out.printf(format, "Roll No", "Name", "Age", "Course");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf(format, rollNo, name, age, course);
    }
}
