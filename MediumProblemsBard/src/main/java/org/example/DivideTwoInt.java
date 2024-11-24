package org.example;

public class DivideTwoInt {
    public int divide(int dividend, int divisor) {
        boolean isNeg = false;
        long res = 0;

        // Check if the result will be negative
        if ((dividend < 0 && divisor > 0) || (divisor < 0 && dividend > 0)) {
            isNeg = true;
        }

        long d1 = Math.abs((long) dividend);  // Using long to handle edge cases like Integer.MIN_VALUE
        long d2 = Math.abs((long) divisor);

        // Perform division using bit manipulation
        while (d1 >= d2) {
            int cnt = 0;
            while (d1 - (d2 << (cnt + 1)) >= 0) {
                ++cnt;
            }
            d1 -= d2 << cnt;
            res += (1L << cnt);  // Adding the result of this bit shift
        }

        // Handle sign and check for overflow
        if (isNeg) {
            res = -res;
            return (int) Math.max(res, (long) Integer.MIN_VALUE);  // Avoid overflow on the negative side
        }
        return (int) Math.min(res, (long) Integer.MAX_VALUE);  // Avoid overflow on the positive side
    }
}
