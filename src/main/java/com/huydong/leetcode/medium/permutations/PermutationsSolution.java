package com.huydong.leetcode.medium.permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsSolution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        for (int i=0 ;i < nums.length; i++){
            data.add(nums[i]);
        }
        backTrack(data, new ArrayList<>(), result);
        return result;
    }
    private void backTrack(List<Integer> data, List<Integer> path, List<List<Integer>> result){
        if (data.size() == 0){
            result.add(path);
            return;
        }
        for (int i=0 ;i < data.size(); i++){
            path.add(data.get(i));
            List<Integer> tmp = new ArrayList<>(data);
            tmp.remove(i);
            backTrack(tmp, new ArrayList<>(path), result);
            path.remove(path.size() -1);
        }

    }

}
