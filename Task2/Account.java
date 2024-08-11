//import java.util.Scanner;
//
//class Account {
//
//    private String ownerName;
//    private double balance;
//
//
//    public Account() {
//        this.balance = 0.0;
//        this.ownerName="Ramesh";
//    }
//
//
//    public Account(String ownerName, double initialBalance) {
//        this.ownerName = ownerName;
//        this.balance = initialBalance;
//    }
//
//
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposited: " + amount);
//        } else {
//            System.out.println("Invalid deposit amount");
//        }
//    }
//
//
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn: " + amount);
//        } else {
//            System.out.println("Invalid withdraw amount or insufficient funds");
//        }
//    }
//
//    public void displayBalance() {
//        System.out.println("Account name: " + ownerName);
//        System.out.println("Current balance: " + balance);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Account account = new Account();
//        account.displayBalance();
//
//        System.out.print("Enter amount to deposit in account: ");
//        double depositAmount1 = scanner.nextDouble();
//        account.deposit(depositAmount1);
//
//        System.out.print("Enter amount to withdraw from account: ");
//        double withdrawAmount1 = scanner.nextDouble();
//        account.withdraw(withdrawAmount1);
//
//        account.displayBalance();
//
//
//    }
//}