import java.util.Scanner;

class Employee extends Person1 {
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public void employeeInfo() {
        displayPersonInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, age, employeeID, salary);

        emp.employeeInfo();

    }
}