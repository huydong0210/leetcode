package com.huydong.leetcode.medium.longest_substring_without_repeating_characters;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharactersSolution {
    // sliding window
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        Set<Character> characterSet = new HashSet<>();
        int max=1;
        int left =0;
        int right = 1;
        characterSet.add(s.charAt(0));
        while (right < s.length()){
            if (!characterSet.contains(s.charAt(right))){
                characterSet.add(s.charAt(right));
                if (characterSet.size() > max){
                    max = characterSet.size();
                }
                right++;
            } else {
                characterSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;

    }

}
