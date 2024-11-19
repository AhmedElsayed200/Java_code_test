package org.example;
import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < n; ++i) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicate values for the second and third elements
                    while (j < n && nums[j] == nums[j - 1]) j++;
                    while (k >= 0 && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }
}
