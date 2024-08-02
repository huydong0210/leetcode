package com.huydong.leetcode.medium.three_sum_closest;

import java.util.Arrays;

public class ThreeSumClosestSolution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        int closest = Math.abs(sum - target);
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int index = nums[i] + nums[left] + nums[right];
                int comparison = Math.abs(index - target);
                if (closest > comparison) {
                    sum = index;
                    closest = comparison;
                }
                if (index - target == 0) {
                    return index;
                } else if (index - target < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
