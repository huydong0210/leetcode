package com.huydong.leetcode.medium.word_break;

import java.util.List;

public class WordBreakSolution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return s.matches(createRegex(wordDict));
    }
    private String createRegex (List<String> wordDict){
        StringBuilder result = new StringBuilder();
        result.append("(");
        for(String word : wordDict ){
            result.append(word).append("|");
        }
        result = new StringBuilder(result.substring(0, result.length() - 1));
        result.append(")*");
        return result.toString();
    }
}
