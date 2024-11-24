package org.example;

public class LenOfLastWord {
    public int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        int ans = 0;

        // Skip trailing spaces
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        // Count the length of the last word
        while (p >= 0 && s.charAt(p) != ' ') {
            ans++;
            p--;
        }

        return ans;
    }
}
