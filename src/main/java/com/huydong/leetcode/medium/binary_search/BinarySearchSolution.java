package com.huydong.leetcode.medium.binary_search;

public class BinarySearchSolution {
    public int search(int[] nums, int target) {
        return searchValue(nums, 0 , nums.length, target);

    }

    private int searchValue(int[] nums, int start, int length, int target) {
        if (length == 0) {
            return -1;
        }
        int mid = start + length / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchValue(nums, start, mid - start, target);
        } else {
            return searchValue(nums, mid +1 , length + start - mid - 1 , target);
        }
    }
}
