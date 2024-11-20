package org.example;

import java.util.*;

public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> quadruplets = new ArrayList<>();

        // Sort the array to use the two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < len - 3; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate elements

            for (int j = i + 1; j < len - 2; ++j) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicate elements

                int k = j + 1, l = len - 1;
                long currSum;
                while (k < l) {
                    currSum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (currSum < target) {
                        k++;
                    } else if (currSum > target) {
                        l--;
                    } else {
                        // Found a valid quadruplet
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        // Skip duplicates
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
            }
        }

        return quadruplets;
    }
}
