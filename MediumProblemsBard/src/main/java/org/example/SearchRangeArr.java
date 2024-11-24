package org.example;

public class SearchRangeArr {
    public int getStart(int[] nums, int t) {
        int l = 0, r = nums.length - 1, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == t || nums[m] > t) {
                r = m - 1; // Target might be at m or on the left side
            } else {
                l = m + 1; // Target is on the right side
            }
        }
        return (l >= nums.length || nums[l] != t) ? -1 : l; // Check if the target exists at position l
    }

    public int getEnd(int[] nums, int t) {
        int l = 0, r = nums.length - 1, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == t || nums[m] < t) {
                l = m + 1; // Target might be at m or on the right side
            } else {
                r = m - 1; // Target is on the left side
            }
        }
        return (r < 0 || nums[r] != t) ? -1 : r; // Check if the target exists at position r
    }

    public int[] searchRange(int[] nums, int t) {
        int s = getStart(nums, t);
        int e = getEnd(nums, t);
        return new int[]{s, e}; // Return the range as an array
    }
}
