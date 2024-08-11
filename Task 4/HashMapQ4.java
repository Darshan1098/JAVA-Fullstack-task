import java.util.HashMap;
import java.util.Scanner;

public class HashMapQ4 {
    private HashMap<String, Integer> studentGrades;

    // Constructor
    public HashMapQ4() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade + ".");
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Student " + name + " has grade: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        HashMapQ4 manager = new HashMapQ4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option;
            try {
                option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
                continue; // Skip the rest of the loop and prompt again
            }

            switch (option) {
                case 1:
                    // Add a new student
                    System.out.print("Enter student name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int addGrade;
                    try {
                        addGrade = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                    } catch (Exception e) {
                        System.out.println("Invalid grade. Please enter a valid integer.");
                        scanner.nextLine(); // Consume the invalid input
                        continue; // Skip the rest of the loop and prompt again
                    }
                    manager.addStudent(addName, addGrade);
                    break;

                case 2:
                    // Remove a student
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    manager.removeStudent(removeName);
                    break;

                case 3:
                    // Display a student's grade
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.nextLine();
                    manager.displayStudentGrade(displayName);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
