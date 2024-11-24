package org.example;

public class RegularExpMatch {
    public boolean solve(String s, String p, int i, int j) {
        if (i >= s.length() && j >= p.length()) return true;
        if (j >= p.length()) return false;
        if (i >= s.length()) {
            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                return solve(s, p, i, j + 2);
            } else {
                return false;
            }
        }

        boolean ans = false;
        if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
            // means match
            char c = s.charAt(i);
            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                ans |= solve(s, p, i, j + 2); // neglect it
                for (int x = i; x < s.length() && (c == s.charAt(x) || p.charAt(j) == '.') && !ans; ++x) {
                    ans |= solve(s, p, x + 1, j + 2); // add many times
                }
            } else {
                ans |= solve(s, p, i + 1, j + 1);
            }
        } else {
            // means not match
            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                ans |= solve(s, p, i, j + 2);
            }
        }

        return ans;
    }

    public boolean isMatch(String s, String p) {
        return solve(s, p, 0, 0);
    }
}
