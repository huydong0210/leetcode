package com.huydong.leetcode.medium.subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSetsSolution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, 0 , new ArrayList<>(), result);
        return result;

    }

    private void backTrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(path);
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backTrack(nums, i + 1, new ArrayList<>(path), result);
            path.remove(path.size() -1);
        }
    }
}
