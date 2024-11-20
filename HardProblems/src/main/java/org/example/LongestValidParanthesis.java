package org.example;

import java.util.*;

public class LongestValidParanthesis {
    public int longestValidParentheses(String s) {
        Stack<Integer> stChar = new Stack<>();
        int n = s.length(), ans = 0;

        // Process each character in the string
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                stChar.push(i);
            } else {
                if (!stChar.isEmpty() && s.charAt(stChar.peek()) == '(') {
                    stChar.pop();
                } else {
                    stChar.push(i);
                }
            }
        }

        // If stack is empty, entire string is valid
        if (stChar.isEmpty()) return n;

        // Calculate longest valid substring by gaps between unclosed positions
        int r = n, l = 0;
        while (!stChar.isEmpty()) {
            l = stChar.pop();
            ans = Math.max(ans, r - l - 1);
            r = l;
        }
        ans = Math.max(ans, r);

        return ans;
    }
}
