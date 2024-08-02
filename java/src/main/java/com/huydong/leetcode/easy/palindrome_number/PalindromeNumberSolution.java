package com.huydong.leetcode.easy.palindrome_number;

public class PalindromeNumberSolution {
    public boolean isPalindrome(int x) {
        int originalValue = x;
        if (x < 0 ) {
            return false;
        }
        int revertedNumber = 0;
        while (x >= 10) {
            revertedNumber = revertedNumber * 10 + (x % 10);
            x = x/10;
        }
        revertedNumber = revertedNumber * 10 + x;
        return revertedNumber == originalValue;
    }
}
