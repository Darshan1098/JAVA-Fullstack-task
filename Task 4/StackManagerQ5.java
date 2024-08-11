import java.util.Stack;
import java.util.Scanner;

public class StackManagerQ5 {
    private Stack<Integer> stack;

    // Constructor
    public StackManagerQ5() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Element " + element + " pushed onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. No element to pop.");
        } else {
            int element = stack.pop();
            System.out.println("Element " + element + " popped from the stack.");
        }
    }

    // Method to display the current stack
    public void displayStack() {
        System.out.println("Current stack: " + stack);
    }

    public static void main(String[] args) {
        StackManagerQ5 manager = new StackManagerQ5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Display Stack");
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
                    // Push a new element onto the stack
                    System.out.print("Enter element to push: ");
                    int pushElement;
                    try {
                        pushElement = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scanner.nextLine(); // Consume the invalid input
                        continue; // Skip the rest of the loop and prompt again
                    }
                    manager.pushElement(pushElement);
                    break;

                case 2:
                    // Pop an element from the stack
                    manager.popElement();
                    break;

                case 3:
                    // Display the current stack
                    manager.displayStack();
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
