package com.huydong.leetcode.medium.sort_an_array;

import java.util.List;
import java.util.Objects;

public class SortAnArraySolution3 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public void mergeSort(int[] nums) {
        int[] result = null;
        if (nums.length > 1) {
            int m = nums.length / 2;
            int[] left = cloneArr(nums, 0, m);
            int[] right = cloneArr(nums, m, nums.length);
            mergeSort(left);
            mergeSort(right);
            result = merge(left, right);
        }
        if (Objects.nonNull(result)) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = result[i];
            }
        }

    }

    public int[] merge(int[] x, int[] y) {
        int[] result = new int[x.length + y.length];
        int xCount = 0;
        int yCount = 0;
        int resultCount = 0;
        while (xCount < x.length && yCount < y.length) {
            if (x[xCount] <= y[yCount]) {
                result[resultCount] = x[xCount];
                xCount++;
                resultCount++;
            } else {
                result[resultCount] = y[yCount];
                yCount++;
                resultCount++;
            }
        }
        if (xCount < x.length) {
            addAll(result, resultCount, x, xCount);
        }
        if (yCount < y.length) {
            addAll(result, resultCount, y, yCount);
        }
        return result;
    }

    private void addAll(int[] des, int sizeDes, int[] from, int indexFrom) {
        for (int i = indexFrom; i < from.length; i++) {
            des[sizeDes] = from[i];
            sizeDes++;
        }
    }

    private int[] cloneArr(int[] x, int from, int length) {
        int[] result = new int[length - from];
        int count = 0;
        for (int i = from; i < length; i++) {
            result[count] = x[i];
            count++;
        }
        return result;
    }

}
