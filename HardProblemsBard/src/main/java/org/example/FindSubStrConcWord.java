package org.example;

import java.util.*;

public class FindSubStrConcWord {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int wLen = words[0].length();
        int n = s.length(), m = words.length;
        int subLen = wLen * m;

        if (n < subLen) return ans;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wLen; ++i) {
            Map<String, Integer> windowCount = new HashMap<>();
            int left = i, count = 0;

            for (int right = i; right <= n - wLen; right += wLen) {
                String word = s.substring(right, right + wLen);
                if (wordCount.containsKey(word)) {
                    windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
                    count++;

                    while (windowCount.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wLen);
                        windowCount.put(leftWord, windowCount.get(leftWord) - 1);
                        left += wLen;
                        count--;
                    }

                    if (count == m) ans.add(left);
                } else {
                    windowCount.clear();
                    count = 0;
                    left = right + wLen;
                }
            }
        }

        return ans;
    }
}
