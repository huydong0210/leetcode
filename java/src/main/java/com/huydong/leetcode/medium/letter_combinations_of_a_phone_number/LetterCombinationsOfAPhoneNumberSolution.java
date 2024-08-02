package com.huydong.leetcode.medium.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumberSolution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return List.of();
        }
        List<String> result = new ArrayList<>();
        Map<Character, List<Character>> hashCharacter = generateHashCharacter();
        backTrack(result, hashCharacter, new String(""), digits);
        return result;
    }

    private void backTrack(List<String> result, Map<Character, List<Character>> hashCharacter, String path, String digits) {
        if (path.length() == digits.length()) {
            result.add(new String(path));
            return ;
        }
        List<Character> index = hashCharacter.get(digits.charAt(path.length()));
        for (char c : index) {
            String tmp = new String(path + c);
            backTrack(result, hashCharacter, tmp, digits);
        }
    }

    private Map<Character, List<Character>> generateHashCharacter() {
        Map<Character, List<Character>> hashCharacter = new HashMap<>();
        hashCharacter.put('2', List.of('a', 'b', 'c'));
        hashCharacter.put('3', List.of('d', 'e', 'f'));
        hashCharacter.put('4', List.of('g', 'h', 'i'));
        hashCharacter.put('5', List.of('j', 'k', 'l'));
        hashCharacter.put('6', List.of('m', 'n', 'o'));
        hashCharacter.put('7', List.of('p', 'q', 'r', 's'));
        hashCharacter.put('8', List.of('t', 'u', 'v'));
        hashCharacter.put('9', List.of('w', 'x', 'y', 'z'));
        return hashCharacter;
    }

}
