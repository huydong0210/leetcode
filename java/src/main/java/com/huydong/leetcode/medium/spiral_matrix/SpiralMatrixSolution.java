package com.huydong.leetcode.medium.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        int lengthRow = matrix.length;
        int lengthCol = matrix[0].length;
        while (result.size() < lengthRow * lengthCol) {
            for (int i = index; i < lengthCol - index; i++) {
                result.add(matrix[index][i]);
            }
            for (int i = index + 1; i < lengthRow - index; i++) {
                result.add(matrix[i][lengthCol - index -1]);
            }
            for (int i = lengthCol - index - 1 -1; i >= index; i--) {
                result.add(matrix[lengthRow - index - 1][i]);
            }
            for (int i = lengthRow - index - 1 -1; i >= index + 1; i--) {
                result.add(matrix[i][index]);
            }
            index++;
        }
        return result.subList(0,lengthRow * lengthCol);

    }
}
