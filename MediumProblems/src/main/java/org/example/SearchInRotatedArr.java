package org.example;

public class SearchInRotatedArr {
    public int search(int[] nums, int t) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            int mVal = nums[m], rVal = nums[r], lVal = nums[l];
            if (mVal == t) return m;

            if (mVal >= lVal) { // Left half is sorted
                if (t >= lVal && t <= mVal) {
                    r = m - 1; // Search in the left half
                } else {
                    l = m + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (t >= mVal && t <= rVal) {
                    l = m + 1; // Search in the right half
                } else {
                    r = m - 1; // Search in the left half
                }
            }
        }

        return -1; // Target not found
    }
}
