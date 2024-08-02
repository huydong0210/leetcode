package com.huydong.leetcode.medium.container_with_most_water;

public class ContainerWithMostWaterSolution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int index = getWater(height, left, right);
            max = max > index ? max : index;
            if (height[left] < height[right]){
                left++;
            } else {
                right --;
            }

        }
        return max;
    }

    private int minOffTwoInt(int a, int b) {
        return a < b ? a : b;
    }

    private int getWater(int[] height, int i, int j) {
        return (j - i) * minOffTwoInt(height[i], height[j]);
    }


}
