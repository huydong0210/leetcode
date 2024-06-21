package com.huydong.leetcode.medium.longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int max = 1;
        int i =0;
        while (i < s.length()){


        }


        return max;
    }

    public Character repeatingCharacter(String s) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!characters.contains(s.charAt(i))) {
                characters.add(s.charAt(i));
            } else {
                return s.charAt(i);
            }
        }
        return null;
    }
}
