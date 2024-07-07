package com.huydong.leetcode.medium.permutations_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTwoSolution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> numbers =new ArrayList<>();
        for (int i : nums){
            numbers.add(i);
        }
        backtrack(result,new ArrayList<>(),numbers, nums.length);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, List<Integer> nums, int size) {
        if (path.size() == size){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i=0 ; i < nums.size(); i++){
            if (i > 0 && nums.get(i).intValue() == nums.get(i-1).intValue()){
                continue;
            }
            path.add(nums.get(i));
            List<Integer> index = new ArrayList<>(nums);
            index.remove(i);
            backtrack(result, new ArrayList<>(path), index,size);
            path.remove(path.size() -1);
        }
    }

}
