package com.huydong.leetcode.medium.maximum_subarray;

public class MaximumSubarraySolution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;

    }

}
