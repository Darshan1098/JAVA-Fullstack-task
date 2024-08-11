//import java.util.Scanner;
//
//public class XYZ {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Product[] products = new Product[5];
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter details for product " + (i + 1) + ":");
//            System.out.print("Product ID: ");
//            int pid = scanner.nextInt();
//            System.out.print("Price: ");
//            double price = scanner.nextDouble();
//            System.out.print("Quantity: ");
//            int quantity = scanner.nextInt();
//
//            products[i] = new Product(pid, price, quantity);
//        }
//
//
//        int maxPricePid = maxPricePid(products);
//        System.out.println("Product ID with the highest price: " + maxPricePid);
//
//
//        double totalAmounts = totalAmount(products);
//        System.out.println("Total amount spent on all products: " + totalAmounts);
//    }
//
//
//    public static int maxPricePid(Product[] products) {
//        double maxPrice = products[0].getPrice();
//        int maxPricePid = products[0].getPid();
//
//        for (int i = 1; i < products.length; i++) {
//            if (products[i].getPrice() > maxPrice) {
//                maxPrice = products[i].getPrice();
//                maxPricePid = products[i].getPid();
//            }
//        }
//
//        return maxPricePid;
//    }
//
//
//    public static double totalAmount(Product[] products) {
//        double totalAmount = 0.0;
//
//        for (Product product : products) {
//            totalAmount += product.getPrice() * product.getQuantity();
//        }
//
//        return totalAmount;
//    }
//}