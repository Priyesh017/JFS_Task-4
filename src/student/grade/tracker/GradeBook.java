package student.grade.tracker;

import java.util.HashMap;
import java.util.Map;

final class GradeBook {
    private final HashMap<String, Integer> gradeMap = new HashMap<>();

    GradeBook() {
        gradeMap.put("Alice", 92);
        gradeMap.put("Bob", 85);
        gradeMap.put("Charlie", 78);
    }

    public void addStudent(String name, int grade) {
        gradeMap.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    public void removeStudent(String name) {
        if (gradeMap.containsKey(name)) {
            gradeMap.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Error: Student '" + name + "' not found.");
        }
    }

    public void displayAllStudents() {
        if (gradeMap.isEmpty()) {
            System.out.println("The grade book is currently empty.");
        } else {
            System.out.println("\n--- Grade Book ---");
            for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
                System.out.println(entry.getKey() + "'s grade is: " + entry.getValue());
            }
        }
    }
}