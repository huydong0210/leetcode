package com.huydong.leetcode.easy.climbing_stairs;

public class ClimbingStairsSolution {
    public int climbStairs(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        int a = 2;
        int b = 3;
        int c = 0;
        int count = 4;
        while (count <= n) {
            c = a + b;
            a = b;
            b = c;
            count ++;
        }
        return c;
    }


}
