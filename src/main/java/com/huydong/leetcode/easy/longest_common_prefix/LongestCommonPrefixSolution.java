package com.huydong.leetcode.easy.longest_common_prefix;

public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for (int i =0; i <strs[0].length(); i++){
            prefix.append(strs[0].charAt(i));
            String index = prefix.toString();
            for (String str : strs){
                if (!str.startsWith(index.toString())){
                    prefix.deleteCharAt(prefix.length() - 1);
                    return prefix.toString();
                };
            }
        }
        return prefix.toString();
    }
}
