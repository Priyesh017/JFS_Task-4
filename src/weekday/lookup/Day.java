package weekday.lookup;

/**
 * The Day class handles the storage and retrieval of weekday names.
 * Using 'final' prevents this class from being extended, ensuring
 * the lookup logic remains secure and unchanged.
 */
final class Day {
    // A final array ensures the reference to the data cannot be changed after initialization.
    private final String[] weekdayNamesArray;

    /**
     * Constructor: Initializes the array with hardcoded values.
     * Sunday is at index 0 as per the standard requirement.
     */
    Day() {
        this.weekdayNamesArray = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    }

    /**
     * Logic for Printing Day:
     * Accesses the array directly using the provided index.
     * Note: This method does not perform an 'if' check because we rely on the JVM
     * to throw an ArrayIndexOutOfBoundsException if the index is invalid,
     * which is then caught in the Main class.
     */
    void printDayName(int position) {
        System.out.println("Weekday Name at index: " + position + " is: " + weekdayNamesArray[position]);
    }
}