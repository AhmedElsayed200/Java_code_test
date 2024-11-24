package org.example;

public class Num1bits {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += (n & 1);  // Add 1 if the least significant bit is 1
            n >>>= 1;         // Unsigned right shift to process the next bit
        }
        return ans;
    }
}
