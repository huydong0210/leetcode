package com.huydong.leetcode.medium.sort_an_array;

public class SortAnArraySolution {
    //counting sort
    public int[] sortArray(int[] nums) {
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
