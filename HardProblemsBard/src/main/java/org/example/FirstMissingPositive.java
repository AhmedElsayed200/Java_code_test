package org.example;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0] == 1 ? 2 : 1;
        boolean isExist = false;

        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] < n && nums[nums[i]] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }

        isExist = nums[0] == n;
        for (int i = 1; i < n; ++i) {
            if (nums[i] != i) return i;
        }

        return isExist ? n + 1 : n;
    }
}
