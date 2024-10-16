package com.huydong.leetcode.medium.next_permutation;

import java.util.Arrays;

public class NextPermutationSolution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            int index = -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && (index == -1 || nums[j] < nums[index])) {
                    index = j;
                }
            }
            if (index != -1) {
                moveElements(nums, index, i);
                sortSubArray(nums, i + 1);
                return;
            }
        }
        Arrays.sort(nums);

    }


    public void moveElements(int[] nums, int from, int destination) {
        int tmp = nums[from];
        for (int i = from; i >= destination + 1; i--) {
            nums[i] = nums[i - 1];
        }
        nums[destination] = tmp;
    }

    public void sortSubArray(int[] nums, int from) {
        int[] tmp = new int[nums.length - from];
        for (int i = from, j = 0; i < nums.length; i++, j++) {
            tmp[j] = nums[i];
        }
        Arrays.sort(tmp);
        for (int i = from, j = 0; i < nums.length; i++, j++) {
            nums[i] = tmp[j];
        }
    }

}
