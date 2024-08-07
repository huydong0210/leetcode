package com.huydong.leetcode.medium.four_sum;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumSolution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Long> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            list.add((long) nums[i]);
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            result.addAll(threeSum(list.subList(i + 1, nums.length), target, nums[i]));
        }
        return result;
    }

    private List<List<Integer>> threeSum(List<Long> nums, int target, int index) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.size() - 2; i++) {
            int left = i + 1;
            int right = nums.size() - 1;
            if (i > 0 && nums.get(i).intValue() == nums.get(i - 1).intValue()) {
                continue;
            }
            while (left < right) {
                long sum = nums.get(i) + nums.get(left) + nums.get(right) + index;
                if (sum == target) {
                    result.add(List.of((int) index, (int) nums.get(i).longValue(), (int) nums.get(left).longValue(), (int) nums.get(right).longValue()));
                    left++;
                    while (left < right && nums.get(left).intValue() == nums.get(left - 1).intValue()) {
                        left++;
                    }
                } else if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                }
            }
        }
        return result;
    }
}
