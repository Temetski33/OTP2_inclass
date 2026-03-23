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
        locale = new Locale("en", "US");

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        System.out.println(rb.getString("prompt1"));
        System.out.println(rb.getString("prompt2"));
    }
}
