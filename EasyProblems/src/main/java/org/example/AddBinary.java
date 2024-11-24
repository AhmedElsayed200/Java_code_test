package org.example;

public class AddBinary {
    public String addBinary(String a, String b) {
        int aLen = a.length(), bLen = b.length();
        int index = Math.max(aLen, bLen) - 1;
        int carry = 0, result = 0, aVal = 0, bVal = 0;
        StringBuilder ans = new StringBuilder();

        while (aLen > 0 || bLen > 0 || carry > 0) {
            aVal = (aLen > 0) ? a.charAt(--aLen) - '0' : 0;
            bVal = (bLen > 0) ? b.charAt(--bLen) - '0' : 0;

            result = aVal + bVal + carry;
            carry = result / 2;
            result = result % 2;

            ans.append(result);
        }

        // Since we're appending results in reverse, reverse the string
        return ans.reverse().toString();
    }
}
