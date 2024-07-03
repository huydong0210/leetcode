package com.huydong.leetcode;

import com.huydong.leetcode.easy.remove_duplicates_from_sorted_array.RemoveDuplicatesFromSortedArraySolution;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArraySolution solution = new RemoveDuplicatesFromSortedArraySolution();
        int[] arr = new int[]{1,1,2};
        int result = solution.removeDuplicates(arr);
        for (int i=0 ; i<result; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("- " + result);
    }
}
