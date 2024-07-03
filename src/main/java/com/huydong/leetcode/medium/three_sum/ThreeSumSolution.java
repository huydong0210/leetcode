package com.huydong.leetcode.medium.three_sum;

import java.util.*;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sortNums(nums);
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

    private void sortNums(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}
