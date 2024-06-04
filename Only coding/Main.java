import java.util.*;

class Product {
    String name;
    double unitPrice;
    int quantity;

    Product(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double getTotalSales() {
        return unitPrice * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("sales_transaction:[");
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("]");
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 3) {
                System.out.println("Invalid input. Please enter in the format 'Name, Unit Price, Quantity'");
                continue;
            }

            String name = parts[0].trim();
            double unitPrice = Double.parseDouble(parts[1].trim());
            int quantity = Integer.parseInt(parts[2].trim());

            products.add(new Product(name, unitPrice, quantity));
        }

        double totalSales = 0;
        Product bestProduct = null;

        for (Product product : products) {
            double productSales = product.getTotalSales();
            totalSales += productSales;
            if (bestProduct == null || productSales > bestProduct.getTotalSales()) {
                bestProduct = product;
            }
        }

        double avgSales = products.isEmpty() ? 0 : totalSales / products.size();

        System.out.println("Total sales: " + totalSales);
        System.out.println("Average sales: " + avgSales);
        System.out.println("Best product: " + (bestProduct != null ? bestProduct.name : "N/A"));

        scanner.close();
    }
}
