package org.example;

public class WildCardMatching {
    public boolean isMatch(String s, String p) {
        // Clean up the pattern to merge consecutive '*'s into one
        StringBuilder newP = new StringBuilder();
        char prev = '-';
        for (char c : p.toCharArray()) {
            if (c == '*' && prev == '*') continue;
            newP.append(c);
            prev = c;
        }

        int n = s.length();
        int m = newP.length();

        // Initialize dp array with false
        boolean[][] dp = new boolean[n + 1][m + 1];

        // Base case: empty string matches empty pattern
        dp[n][m] = true;

        // Fill the dp table
        for (int i = n; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                if (newP.charAt(j) == '?') {
                    // '?' matches any single character
                    dp[i][j] = (i < n && dp[i + 1][j + 1]);
                } else if (newP.charAt(j) == '*') {
                    // '*' can match an empty sequence or any sequence of characters
                    dp[i][j] = dp[i][j + 1] || (i < n && dp[i + 1][j]);
                } else {
                    // Exact character match
                    dp[i][j] = (i < n && newP.charAt(j) == s.charAt(i) && dp[i + 1][j + 1]);
                }
            }
        }

        // Final answer is dp[0][0] which represents whether s matches p from the start
        return dp[0][0];
    }
}
