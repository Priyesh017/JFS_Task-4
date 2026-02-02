package weekday.lookup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc) {
            System.out.print("Enter any position (0-6): ");
            int position = sc.nextInt();

            Day day = new Day();
            day.printDayName(position);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception: Please enter a number between 0 and 6.");
        }
    }
}
