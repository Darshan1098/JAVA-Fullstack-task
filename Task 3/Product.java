public class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate sales tax
    @Override
    public double calcTax() {
        return price * quantity * SALES_TAX_RATE;
    }

    @Override
    public String toString() {
        return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
    }
}
