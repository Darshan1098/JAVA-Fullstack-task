import java.util.Scanner;

public class WeekdaysQ3 {
    public static void main(String[] args) {
        // Array to store names of weekdays
        String[] weekdays = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter the day index
            System.out.print("Enter the day index (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the index is out of range
            System.out.println("Error: Index out of range. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle other potential exceptions (e.g., input mismatch)
            System.out.println("Invalid input. Please enter a valid integer between 0 and 6.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
