package com.huydong.leetcode.medium.reverse_integer;

public class ReverseIntegerSolution {
    public int reverse(int x) {
        long result = 0;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x *= -1;

        }
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (Math.abs(result) > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) result * sign;
        }
    }
}
