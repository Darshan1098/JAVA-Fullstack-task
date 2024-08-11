public interface Taxable {
    double SALES_TAX_RATE = 0.07;   // 7% sales tax
    double INCOME_TAX_RATE = 0.105; // 10.5% income tax

    // Abstract method to calculate tax
    double calcTax();
}
