package com.huydong.leetcode.medium.sort_an_array;

public class SortAnArraySolution2 {

    //quick sort
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length);
        return nums;
    }

    private void quickSort(int[] nums, int start, int length) {
        if (length == 0) {
            return;
        }
        int pivot = start + length - 1;
        int i = start - 1;
        int j = start;
        while (j <= pivot - 1) {
            if (nums[j] <= nums[pivot]) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }
        i++;
        swap(nums, i, pivot);
        quickSort(nums, start, i - start);
        quickSort(nums, i + 1, start + length - 1 - i);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
