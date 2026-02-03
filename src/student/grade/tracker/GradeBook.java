package student.grade.tracker;

import java.util.HashMap;
import java.util.Map;

/**
 * GradeBook implements the logic for a Student-Grade management system.
 * It uses a HashMap to ensure O(1) performance for most operations.
 */
final class GradeBook {
    // Keys: Student Names (String), Values: Grades (Integer)
    private final HashMap<String, Integer> gradeMap = new HashMap<>();

    /**
     * Requirement: Add a new student.
     * Logic: If the student exists, put() will update their grade.
     */
    public void addStudent(String name, int grade) {
        gradeMap.put(name, grade);
        System.out.println(">>> " + name + " added with grade: " + grade);
    }

    /**
     * Requirement: Remove a student.
     * Logic: Uses containsKey to ensure we don't try to remove a missing student.
     */
    public void removeStudent(String name) {
        if (gradeMap.containsKey(name)) {
            gradeMap.remove(name);
            System.out.println(">>> Student " + name + " has been removed.");
        } else {
            System.out.println("Error: No record found for '" + name + "'.");
        }
    }

    /**
     * Requirement: Display a student's grade by name.
     * Logic: uses get(). Returns the value if found, or null if not.
     */
    public void displayGradeByName(String name) {
        Integer grade = gradeMap.get(name);
        if (grade != null) {
            System.out.println("RESULT: " + name + " has a grade of " + grade);
        } else {
            System.out.println("Error: Student '" + name + "' not found.");
        }
    }

    /**
     * Logic: Iterates through the entry set to print all key-value pairs.
     */
    public void displayAll() {
        if (gradeMap.isEmpty()) {
            System.out.println("The grade book is currently empty.");
        } else {
            System.out.println("\n--- Full Grade List ---");
            for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + " | Grade: " + entry.getValue());
            }
        }
    }
}