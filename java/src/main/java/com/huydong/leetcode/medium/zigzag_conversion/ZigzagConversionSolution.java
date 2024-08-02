package com.huydong.leetcode.medium.zigzag_conversion;

public class ZigzagConversionSolution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[][] zigzag = new char[numRows][1000];
        int row = -1;
        int col = 0;
        int i = 0;
        while (i < s.length()) {
            for (row++; row < numRows; row++) {
                zigzag[row][col] = s.charAt(i);
                i++;
                if (i >= s.length()) {
                    break;
                }
            }
            if (i >= s.length()) {
                break;
            }
            row--;
            for (row--, col++; row >= 0; row--, col++) {
                zigzag[row][col] = s.charAt(i);
                i++;
                if (i >= s.length()) {
                    break;
                }
            }
            row++;
            col--;
        }
        StringBuilder result = new StringBuilder();
        int numCols = s.length() / (numRows + numRows - 2) * (numRows - 1) + numRows - 1;
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < numCols; k++) {
                if (zigzag[j][k] != 0){
                    result.append(zigzag[j][k]);
                }
                if (result.toString().length() == s.length()) {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

}
