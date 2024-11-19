package org.example;

public class StringToInt {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        boolean isNeg = false;
        long ans = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle signs
        if (i < n && s.charAt(i) == '-') {
            isNeg = true;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        // Handle case where the first non-space character is not a number
        if (i < n && !Character.isDigit(s.charAt(i))) {
            return 0;  // If the first character after spaces is not a digit, return 0
        }

        // Process the digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            // Check for overflow
            if (ans >= Integer.MAX_VALUE) {
                break;
            }
            i++;
        }

        // Apply sign if negative
        if (isNeg) {
            ans *= -1;
        }

        // Return the result, clamping it to the integer limits if necessary
        if (ans >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (ans <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) ans;
    }
}
