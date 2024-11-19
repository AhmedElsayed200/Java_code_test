package org.example;
import java.util.*;

public class ClosetSum3 {
    public int threeSumClosest(int[] nums, int target) {
        int lenNums = nums.length;
        int closestSum = 0, minDiff = Integer.MAX_VALUE;

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < lenNums - 2; ++i) {
            int j = i + 1, k = lenNums - 1;
            int currSum;

            while (j < k) {
                currSum = nums[i] + nums[j] + nums[k];

                if (currSum < target) {
                    j++;
                } else {
                    k--;
                }

                int currDiff = Math.abs(target - currSum);
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    closestSum = currSum;
                }
            }
        }

        return closestSum;
    }
}
