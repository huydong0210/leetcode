package com.huydong.leetcode.hard.regular_expression_matching;

public class RegularExpressionMatchingSolution {
    public boolean isMatch(String s, String p) {
        return s.matches(p.replaceAll("[*]{2,}", "*"));
    }
}
