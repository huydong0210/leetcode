package com.huydong.leetcode.easy.valid_parentheses;

import java.util.Objects;
import java.util.Stack;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character closeBracket =getCloseBracket(s.charAt(i));
            if (Objects.nonNull(closeBracket)) {
                stack.push(s.charAt(i)); // open bracket
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                Character openBracket = stack.pop();
                if (Objects.isNull(openBracket)) {
                    return false;
                } else {
                    if (getCloseBracket(openBracket).charValue() != s.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    private Character getCloseBracket(Character c) {
        switch (c) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
            default:
                return null;
        }
    }
}
