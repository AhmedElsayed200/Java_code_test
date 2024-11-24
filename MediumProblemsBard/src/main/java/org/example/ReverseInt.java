package org.example;

public class ReverseInt {
    public int reverse(int x) {
        boolean isNeg = false;
        long ans = 0;
        long tmpVal = x;

        if (x < 0) {
            isNeg = true;
            tmpVal = -tmpVal;
        }

        while (tmpVal > 0) {
            int lastDigit = (int) (tmpVal % 10);
            tmpVal /= 10;
            ans = ans * 10 + lastDigit;
        }

        if (isNeg) {
            ans = -ans;
        }

        // Check for overflow
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }
}
