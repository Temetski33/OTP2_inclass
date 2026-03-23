import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Hello shop");

        Scanner input = new Scanner(System.in);
        System.out.println("Select a language");
        System.out.println("1. English");
        System.out.println("2. Suomi");
        System.out.println("3. Svenska");
        System.out.println("4. Japanese");
        int choice = input.nextInt();

        Locale locale;

        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.println(rb.getString("promptItem"));
        double itemsCount = input.nextDouble();
        double totalCost = calculateTotalCost(input, rb, itemsCount);
        System.out.println(rb.getString("cost") + " " + totalCost);
    }

    public static double multiplyMe(double a, double b) {
        return a * b;
    }

    public static double calculateTotalCost(Scanner input, ResourceBundle rb, double itemsCount) {
        double totalCost = 0;

        for (int i = 0; i < itemsCount; i++) {
            System.out.println(rb.getString("price"));
            double price = input.nextDouble();

            System.out.println(rb.getString("quantity"));
            double quantity = input.nextDouble();

            totalCost += multiplyMe(price, quantity);
        }

        return totalCost;

    }

    public static double calculateTotalCost(double[] prices, double[] quantities) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += multiplyMe(prices[i], quantities[i]);
        }
        return total;
    }
}