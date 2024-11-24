package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestBuySellTest {

    private final BestBuySell bestBuySell = new BestBuySell();

    @Test
    public void testMaxProfitWithTypicalCase() {
        // Typical case: profit can be made
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(5, result, "The maximum profit should be 5");
    }

    @Test
    public void testMaxProfitWithDecreasingPrices() {
        // Case where prices are strictly decreasing
        int[] prices = {7, 6, 4, 3, 1};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(0, result, "The maximum profit should be 0 since no profit can be made");
    }

    @Test
    public void testMaxProfitWithConstantPrices() {
        // Case where all prices are the same
        int[] prices = {5, 5, 5, 5, 5};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(0, result, "The maximum profit should be 0 as no change in price");
    }

    @Test
    public void testMaxProfitWithSinglePrice() {
        // Case where there is only one price (no transactions possible)
        int[] prices = {5};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(0, result, "The maximum profit should be 0 for a single price point");
    }

    @Test
    public void testMaxProfitWithTwoPrices() {
        // Case with only two prices
        int[] prices = {1, 6};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(5, result, "The maximum profit should be 5 from buying at 1 and selling at 6");
    }

    @Test
    public void testMaxProfitWithEmptyArray() {
        // Case with an empty array (no prices)
        int[] prices = {};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(0, result, "The maximum profit should be 0 when no prices are given");
    }

    @Test
    public void testMaxProfitWithLargeInput() {
        // Performance case: test with a large input size (up to 10^5)
        int[] prices = new int[100000];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = (i % 1000); // Prices repeat in a pattern
        }
        int result = bestBuySell.maxProfit(prices);
        assertTrue(result >= 0, "The maximum profit should be a non-negative value");
    }

    @Test
    public void testMaxProfitWithSharpPriceDrop() {
        // Case with a sharp price drop after initial increase
        int[] prices = {1, 3, 2, 1};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(2, result, "The maximum profit should be 2 from buying at 1 and selling at 3");
    }

    @Test
    public void testMaxProfitWithAllIncreasingPrices() {
        // Case where prices are strictly increasing
        int[] prices = {1, 2, 3, 4, 5};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(4, result, "The maximum profit should be 4 from buying at 1 and selling at 5");
    }

    @Test
    public void testMaxProfitWithPeakAtTheEnd() {
        // Case where the maximum profit is at the very end
        int[] prices = {10, 1, 5, 3, 6, 4, 15};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(14, result, "The maximum profit should be 14 from buying at 1 and selling at 15");
    }

    @Test
    public void testMaxProfitWithMultiplePeaks() {
        // Case with multiple peaks and valleys
        int[] prices = {1, 3, 2, 8, 4, 10};
        int result = bestBuySell.maxProfit(prices);
        assertEquals(9, result, "The maximum profit should be 8 from buying at 2 and selling at 10");
    }

}
