package org.example;

public class RevBits {
    public long reverseBits(long n) {
        long ans = 0;
        long cnt = 62;
        while (n != 0) {
            ans |= (n & 1) << cnt;  // Get the least significant bit and place it in the correct position
            n >>>= 1;                // Unsigned right shift
            cnt--;
        }
        return ans;
    }
}
