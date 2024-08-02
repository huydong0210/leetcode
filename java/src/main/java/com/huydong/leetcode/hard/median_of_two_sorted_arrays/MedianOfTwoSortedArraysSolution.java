package com.huydong.leetcode.hard.median_of_two_sorted_arrays;

public class MedianOfTwoSortedArraysSolution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = mergeTwoSortedArray(nums1, nums2);
        double median = 0;
        int centerIndex = (mergedArr.length - 1) / 2;
        if (mergedArr.length % 2 == 0) {
            median = (mergedArr[centerIndex] + mergedArr[centerIndex + 1]) / (double) 2;
        } else {
            median = mergedArr[centerIndex];
        }
        return median;
    }

    private int[] mergeTwoSortedArray(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] result = new int[a.length + b.length];
        int index = 0;
        while (i < a.length || j < b.length) {
            switch (compare(a, i, b, j)) {
                case 1: {
                    result[index] = a[i];
                    i++;
                    index++;
                    break;
                }
                case -1: {
                    result[index] = b[j];
                    j++;
                    index++;
                    break;
                }
                case 0:
                    break;

            }

        }
        return result;
    }

    private int compare(int[] a, int i, int b[], int j) {
        if (i < a.length && j < b.length) {
            return a[i] <= b[j] ? 1 : -1;
        } else if (i >= a.length) {
            return -1;
        } else if (j >= b.length) {
            return 1;
        }
        return 0;
    }
}
