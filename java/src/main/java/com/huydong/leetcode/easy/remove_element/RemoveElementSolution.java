package com.huydong.leetcode.easy.remove_element;

public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int j =0;
        int[] tmp = new int[nums.length];
        for (int i=0; i <nums.length; i++){
            if (nums[i] != val){
                tmp[j] = nums[i];
                j++;
            }
        }
        for (int i=0 ;i< j; i++){
            nums[i] = tmp [i];
        }
        return j;
    }
}
