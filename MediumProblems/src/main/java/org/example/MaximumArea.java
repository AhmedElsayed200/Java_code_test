package org.example;

public class MaximumArea {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, mxArea = 0;

        while (l < r) {
            int w = r - l;  // width between the two pointers
            int lH = height[l], rH = height[r];  // heights at the left and right pointers
            mxArea = Math.max(mxArea, w * Math.min(lH, rH));  // calculate area and update max area
            if (lH > rH) {
                r--;  // move the right pointer to the left if left height is greater
            } else {
                l++;  // move the left pointer to the right if right height is greater or equal
            }
        }

        return mxArea;  // return the maximum area found
    }
}
