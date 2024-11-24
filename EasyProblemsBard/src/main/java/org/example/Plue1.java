package org.example;

public class Plue1 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int lastElement = digits[n - 1];

        if (lastElement < 9) {
            digits[n - 1]++;
        } else {
            int carry = 1;
            digits[n - 1] = 0;
            int i = n - 2;

            while (i >= 0 && carry > 0) {
                digits[i]++;
                if (digits[i] != 10) {
                    carry = 0;
                } else {
                    digits[i] = 0;
                }
                i--;
            }

            // If carry still exists, prepend 1 to the array
            if (digits[0] == 0) {
                int[] newDigits = new int[n + 1];
                newDigits[0] = 1;
                System.arraycopy(digits, 0, newDigits, 1, n);
                return newDigits;
            }
        }

        return digits;
    }
}
