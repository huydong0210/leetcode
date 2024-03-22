package com.huydong.leetcode;

import com.huydong.leetcode.two_sum.TwoSumSolution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution =new TwoSumSolution();
        int [] test = Arrays.stream(List.of(3,2,4).toArray()).mapToInt(n -> (int) n).toArray();
        int [] result = twoSumSolution.twoSum(test, 6);
        System.out.println(result[0] +" "+ result[1]);
    }
}
