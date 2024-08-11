import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and processing for Employee
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        double incomeTax = employee.calcTax();
        System.out.println(employee);
        System.out.println("Income Tax: " + incomeTax);

        // Input and processing for Product
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();

        System.out.print("Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        double salesTax = product.calcTax();
        System.out.println(product);
        System.out.println("Sales Tax: " + salesTax);

        scanner.close();
    }
}
