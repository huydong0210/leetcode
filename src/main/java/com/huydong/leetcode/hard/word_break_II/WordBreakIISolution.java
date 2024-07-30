package com.huydong.leetcode.hard.word_break_II;

import java.util.ArrayList;
import java.util.List;

public class WordBreakIISolution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        backTrack(s, wordDict, result, new String(""));
        return result;
    }
    public void backTrack(String s, List<String> wordDict, List<String> result, String path){
        if (s.length() == 0){
            result.add(new String(path.substring(0, path.length() - 1)));
            return;
        }
        for (String word : wordDict){
            if (s.startsWith(word)){
                backTrack(s.substring(word.length()), wordDict, result, new String(path + word + " "));
            }
        }

    }
}
