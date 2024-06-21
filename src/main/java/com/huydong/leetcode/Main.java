package com.huydong.leetcode;

import com.huydong.leetcode.easy.longest_common_prefix.LongestCommonPrefixSolution;
import com.huydong.leetcode.easy.palindrome_number.PalindromeNumberSolution;
import com.huydong.leetcode.easy.roman_to_integer.RomanToIntegerSolution;
import com.huydong.leetcode.medium.add_two_numbers.ListNode;
import com.huydong.leetcode.medium.longest_substring_without_repeating_characters.LongestSubstringWithoutRepeatingCharactersSolution;

public class Main {
    public static void main(String[] args) {
        LongestCommonPrefixSolution solution = new LongestCommonPrefixSolution();
        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
