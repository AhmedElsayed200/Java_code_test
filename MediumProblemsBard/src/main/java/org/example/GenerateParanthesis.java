package org.example;

import java.util.*;

public class GenerateParanthesis {
    public void dfs(int n, StringBuilder currComp, List<String> ans, int open, int i) {
        if (i >= n) {
            if (open == 0) ans.add(currComp.toString());
            return;
        }

        if (open > 0) {
            currComp.setCharAt(i, ')');
            dfs(n, currComp, ans, open - 1, i + 1);
        }
        if (open < n / 2) {
            currComp.setCharAt(i, '(');
            dfs(n, currComp, ans, open + 1, i + 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        n *= 2;  // Double the number of parentheses needed
        List<String> ans = new ArrayList<>();
        StringBuilder currComp = new StringBuilder(n);

        // Initialize with placeholder values
        for (int i = 0; i < n; i++) {
            currComp.append('*');
        }

        dfs(n, currComp, ans, 0, 0);  // Start DFS to generate valid combinations

        return ans;
    }
}
