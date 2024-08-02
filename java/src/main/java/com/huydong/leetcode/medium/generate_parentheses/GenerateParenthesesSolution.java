package com.huydong.leetcode.medium.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesSolution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        expand(result, "(", "(", n, 1, 0);
        return result;
    }

    private void expand(List<String> result, String originalValue, String currentValue, int n, int open, int close) {
        if (originalValue.length() == n * 2) {
            result.add(originalValue);
        }
        String index = currentValue;
        if (currentValue.length() >= 2 && currentValue.substring(currentValue.length() - 2).equals("()")) {
            index = currentValue.substring(0, currentValue.length() - 2);
        }
        if (index.length() == 0) {
            if (open < n && close < n) {
                expand(result, originalValue + "(", index + "(", n, open + 1, close);
            }
        } else {
            if (open < n && close < n) {
                expand(result, originalValue + "(", index + "(", n, open + 1, close);
            }
            if (close < n) {
                expand(result, originalValue + ")", index + ")", n, open, close + 1);
            }
        }
    }


}
