package com.huydong.leetcode.easy.remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFromSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        for (int i=0 ; i < result -1; i++){
            int j = i;
            while (j < result && nums[i] == nums[j]){
                j++;
            }
            int count = j - i - 1;
            removeSomeElements(nums, i + 1, count, result);
            result-=count;
        }
        return result;
    }
    private void removeSomeElements(int nums[], int index , int count, int k){
        if (count == 0){
            return;
        }
        for (int i=index; i < k - count ; i++){
            nums[i] = nums[i + count];
        }
    }

}
