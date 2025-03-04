package com.huydong.leetcode.easy.product_of_array_except_self;

import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> fromStart = new HashMap<>();
        Map<Integer, Integer> fromEnd = new HashMap<>();
        int mul = 1;
        for (int i = 0; i < nums.length; i++) {
            mul *= nums[i];
            fromStart.put(i, mul);
        }
        mul = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            mul *= nums[i];
            fromEnd.put(i, mul);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                result[i] = fromEnd.get(i + 1);
            } else if (i == nums.length - 1) {
                result[i] = fromStart.get(i - 1);
            } else {
                result[i] = fromStart.get(i - 1) * fromEnd.get(i + 1);
            }
        }
        return result;
    }
}
