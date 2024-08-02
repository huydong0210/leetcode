package com.huydong.leetcode.easy.most_common_word;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MostCommonWordSolution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("[ !?',;.]");
        Map<String, Integer> hashWord = new HashMap<>();
        for (String word : words) {
            if (word.equals("")){
                continue;
            }
            word = word.toLowerCase();
            if (Objects.isNull(hashWord.get(word))) {
                hashWord.put(word, 1);
            } else {
                int count = hashWord.get(word) + 1;
                hashWord.put(word, count);
            }
        }
        int max = -1;
        String result = null;
        for (String word : hashWord.keySet()){
            Integer count = hashWord.get(word);
            if (Objects.nonNull(count)){
                if (count > max && !isBannedWord(word, banned)){
                    result = word;
                    max = count;
                }
            }
        }
        return result;

    }

    private boolean isBannedWord(String word, String[] banned) {
        for (String index : banned) {
            if (index.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
