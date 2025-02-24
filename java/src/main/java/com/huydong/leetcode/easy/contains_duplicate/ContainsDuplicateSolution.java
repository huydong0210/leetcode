package com.huydong.leetcode.easy.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}
