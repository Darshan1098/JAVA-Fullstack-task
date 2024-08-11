public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate income tax
    @Override
    public double calcTax() {
        return salary * INCOME_TAX_RATE;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }
}
