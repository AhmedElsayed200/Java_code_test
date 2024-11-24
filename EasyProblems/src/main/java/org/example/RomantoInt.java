package org.example;

import java.util.*;

public class RomantoInt {
    public int romanToInt(String s) {
        Map<Character, Integer> romanSymbolMap = new HashMap<>();
        romanSymbolMap.put('I', 1);
        romanSymbolMap.put('V', 5);
        romanSymbolMap.put('X', 10);
        romanSymbolMap.put('L', 50);
        romanSymbolMap.put('C', 100);
        romanSymbolMap.put('D', 500);
        romanSymbolMap.put('M', 1000);

        int numericalVal = 0;
        int ptr = 0;

        while (ptr < s.length()) {
            int currVal = romanSymbolMap.get(s.charAt(ptr));
            int nextVal = (ptr + 1 < s.length()) ? romanSymbolMap.get(s.charAt(ptr + 1)) : 0;

            if (currVal >= nextVal) {
                numericalVal += currVal;
                ptr++;
            } else {
                numericalVal += (nextVal - currVal);
                ptr += 2;
            }
        }

        return numericalVal;
    }
}
