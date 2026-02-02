package weekday.lookup;

public class Day {
    private final String[] weekdayNamesArray;
    Day() {
        this.weekdayNamesArray = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    }

    void printDayName(int position) {
        System.out.println("Weekday Name at index: " + position + " is: " + weekdayNamesArray[position]);
    }
}
