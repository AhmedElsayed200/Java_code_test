package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestBuySellTest {

    @Test
    public void testSingleElementArray() {
        BestBuySell bestBuySell = new BestBuySell();
        int[] prices = {7};
        assertEquals(0, bestBuySell.maxProfit(prices));
    }

    @Test
    public void testMonotonicallyIncreasingArray() {
        BestBuySell bestBuySell = new BestBuySell();
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, bestBuySell.maxProfit(prices));
    }

    @Test
    public void testMonotonicallyDecreasingArray() {
        BestBuySell bestBuySell = new BestBuySell();
        int[] prices = {5, 4, 3, 2, 1};
        assertEquals(0, bestBuySell.maxProfit(prices));
    }

    @Test
    public void testMultiplePeaksAndValleys() {
        BestBuySell bestBuySell = new BestBuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestBuySell.maxProfit(prices));
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, bestBuySell.maxProfit(prices2));
    }

    @Test
    public void testZeroProfit() {
        BestBuySell bestBuySell = new BestBuySell();
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, bestBuySell.maxProfit(prices));
    }

    @Test
    public void testLargeInput() {
        // Create a large array with random values
        int[] largePrices = new int[100000];
        // ... (populate the array with random values)
        // ... (test the function with largePrices)
        // Note: For large inputs, consider using a parameterized test with different input sizes.
    }
}