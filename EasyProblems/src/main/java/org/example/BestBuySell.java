package org.example;

public class BestBuySell {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int maxPrice = 0;

        // Traverse the array from the end
        for (int i = prices.length - 1; i >= 0; --i) {
            maxPrice = Math.max(maxPrice, prices[i]);
            ans = Math.max(ans, maxPrice - prices[i]);
        }

        return ans;
    }
}
