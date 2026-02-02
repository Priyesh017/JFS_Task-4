package voter.eligibility;

import exception.handling.AgeNotValidException;

final class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    String format = "%-10s %-25s %-25s%n";

    Voter(int voterId, String name, int age) throws AgeNotValidException {
        if(age < 18) {
            throw new AgeNotValidException("Invalid age for Voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Voter Eligibility Successful");
        System.out.printf(format, "Voter ID", "Name", "Age");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf(format, voterId, name, age);
    }
}
