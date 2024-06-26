package com.huydong.leetcode.medium.longest_palindromic_substring;

import java.util.Objects;

public class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        int max = 1;
        String result = s.substring(0, 1);;
        int i = 0;
        while (i < s.length()) {
            String twoChar = null;
            String threeChar = null;
            String fourChar = null;
            if (i + 2 <= s.length()) {
                twoChar = s.substring(i, i + 2);
            }
            if (i + 3 <= s.length()) {
                threeChar = s.substring(i, i + 3);
            }
            if (i + 4 <= s.length()) {
                fourChar = s.substring(i, i + 4);
            }
            if (Objects.nonNull(twoChar) && twoChar.charAt(0) == twoChar.charAt(1)) {
                String tmp = findLongestPalindromicAllSameCharacter(s, i, i + 1);
                if (tmp.length() > max) {
                    max = tmp.length();
                    result = tmp;
                }
            }
            if (Objects.nonNull(threeChar) && threeChar.charAt(0) == threeChar.charAt(2)) {
                String tmp = findLongestPalindromicNotAllSameCharacter(s, i, i + 2);
                if (tmp.length() > max) {
                    max = tmp.length();
                    result = tmp;
                }
            }
            if (Objects.nonNull(fourChar) && fourChar.charAt(0) == fourChar.charAt(3) && fourChar.charAt(1) == fourChar.charAt(2)) {
                String tmp = findLongestPalindromicNotAllSameCharacter(s, i, i + 3);
                if (tmp.length() > max) {
                    max = tmp.length();
                    result = tmp;
                }
            }
            i++;
        }
        return result;
    }

    private String findLongestPalindromicAllSameCharacter(String s, int left, int right) {
        while (left > 0 || right < s.length() - 1) {
            boolean isContinueExpend = false;

            if (left > 0 && s.charAt(left) == s.charAt(left - 1)) {
                left--;
                isContinueExpend = true;
            }
            if (right < s.length() - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
                isContinueExpend = true;
            }
            if (!isContinueExpend) {
                break;
            }

        }
        return s.substring(left, right + 1);
    }

    private String findLongestPalindromicNotAllSameCharacter(String s, int left, int right) {
        while (left > 0 && right < s.length() - 1) {
            if (s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return s.substring(left, right + 1);
    }

}
