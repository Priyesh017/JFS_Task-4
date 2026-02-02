package voter.eligibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n============= Voter Eligibility =============");
        try(sc) {
            System.out.print("Enter Voter ID: ");
            int voterId = sc.nextInt();
            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Voter voter = new Voter(voterId, name, age);
            voter.display();
        } catch(Exception e) {
            System.out.println("Voter Eligibility Failed: " + e.getMessage());
        }
    }
}
