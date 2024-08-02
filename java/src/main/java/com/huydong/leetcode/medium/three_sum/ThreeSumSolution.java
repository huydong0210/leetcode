package com.huydong.leetcode.medium.three_sum;

import java.util.*;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        nums = sortNums(nums);
//        boolean isExistThreeZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i >0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (!(j >= k || nums[k] < 0)) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum ==0 ){
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j-1] && j < k){
                        j++;
                    }
                } else if (sum < 0){
                    j++;
                } else if (sum > 0){
                    k--;
                }
            }
        }
        return result;
    }

    public int[] sortNums(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = min > nums[i] ? nums[i] : min;
            max = max < nums[i] ? nums[i] : max;
        }
        int[] index = new int[max - min + 1];
        for (int i = 0; i < index.length; i++) {
            index[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            index[nums[i] - min] += 1;
        }
        for (int i = 1; i < index.length; i++) {
            index[i] = index[i] + index[i - 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[index[nums[i] - min] - 1] = nums[i];
            index[nums[i] - min] -= 1;
        }
        return result;
    }
}
