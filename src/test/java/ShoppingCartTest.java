import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    void testMultiplyMeBasic() {
        assertEquals(20.0, ShoppingCart.multiplyMe(4.0, 5.0));
        assertEquals(7.5, ShoppingCart.multiplyMe(2.5, 3.0));
    }

    @Test
    void testMultiplyMeWithZero() {
        assertEquals(0.0, ShoppingCart.multiplyMe(10.0, 0.0));
        assertEquals(0.0, ShoppingCart.multiplyMe(0.0, 99.0));
    }

    @Test
    void testMultiplyMeNegativeValues() {
        assertEquals(-15.0, ShoppingCart.multiplyMe(-3.0, 5.0));
        assertEquals(12.0, ShoppingCart.multiplyMe(-3.0, -4.0));
    }

    // Theoretical test for main function with mock arrays
    @Test
    void testCalculateTotalCostMultipleItems() {
        double[] prices = { 2.0, 5.0, 1.5 };
        double[] quantities = { 3.0, 1.0, 4.0 };

        // Expected:
        // 2*3 = 6
        // 5*1 = 5
        // 1.5*4 = 6
        // Total = 17
        double expected = 17.0;

        assertEquals(expected, ShoppingCart.calculateTotalCost(prices, quantities));
    }

    @Test
    void testCalculateTotalCostEmpty() {
        double[] prices = {};
        double[] quantities = {};

        assertEquals(0.0, ShoppingCart.calculateTotalCost(prices, quantities));
    }

    @Test
    void testCalculateTotalCostSingleItem() {
        double[] prices = { 9.99 };
        double[] quantities = { 2.0 };

        assertEquals(19.98, ShoppingCart.calculateTotalCost(prices, quantities));
    }

    // Test for mock arrays missmatch
    @Test
    void testCalculateTotalCostMismatchedArrays() {
        double[] prices = { 1.0, 2.0 };
        double[] quantities = { 5.0 };

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ShoppingCart.calculateTotalCost(prices, quantities);
        });
    }
}
