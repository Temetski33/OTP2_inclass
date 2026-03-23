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
        int choice = input.nextInt();

        Locale locale;

        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println(rb.getString("prompt1"));
        double a = input.nextDouble();
        System.out.println(rb.getString("prompt2"));
        double b = input.nextDouble();
        double summa = addMe(a, b);
        double erotus = subMe(a, b);
        System.out.println(rb.getString("sum") + " " + summa);
        System.out.println(rb.getString("subtract") + " " + erotus);
    }

    public static double addMe(double a, double b) {
        return a + b;
    }

    public static double subMe(double a, double b) {
        return a - b;
    }
}
