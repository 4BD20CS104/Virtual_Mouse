import java.util.ArrayList;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object[]> sales_transactions = new ArrayList<>();

        while (true) {
            String product = scanner.nextLine();
            if ("exit".equalsIgnoreCase(product)) {
                break;
            }
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            sales_transactions.add(new Object[]{product, price, quantity});
        }
        for (Object[] transaction : sales_transactions) {
            System.out.println( transaction[0] +", "+ (double)transaction[1] + ", " + (int)transaction[2]);
        }
        
        scanner.close();
    }
}
