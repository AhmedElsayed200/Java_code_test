package org.example;

import java.util.*;

public class Pascal {
    private int solve(int[][] vec, int i, int j) {
        if (i == j || j == 0) {
            return vec[i][j] = 1;
        }

        int left = (vec[i - 1][j] != 0) ? vec[i - 1][j] : solve(vec, i - 1, j);
        int right = (vec[i - 1][j - 1] != 0) ? vec[i - 1][j - 1] : solve(vec, i - 1, j - 1);

        return vec[i][j] = left + right;
    }

    public List<List<Integer>> generate(int numRows) {
        int[][] ans = new int[numRows][numRows];

        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j <= i; ++j) {
                ans[i][j] = solve(ans, i, j);
            }
        }

        // Convert the 2D array into a list of lists
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                row.add(ans[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}
