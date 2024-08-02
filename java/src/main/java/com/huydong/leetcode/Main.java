package com.huydong.leetcode;

import com.huydong.leetcode.easy.remove_duplicates_from_sorted_array.RemoveDuplicatesFromSortedArraySolution;
import com.huydong.leetcode.medium.word_break.WordBreakSolution;
import com.huydong.leetcode.medium.word_search.WordSearchSolution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        boolean[][] a= new boolean[3][3];
        a[1][1]= true;
        System.out.println(a[2][2]);
        boolean[][] b = a.clone();
        b[2][2]= true;
        System.out.println(a[2][2]);
        System.out.println(b[2][2]);
        Map<Integer, Integer> p = new HashMap<>();
        new HashMap<>(p);

//        boolean[] a= new boolean[10];
//        a[1] = true;
//        boolean []b = a.clone();
//        b[2] =true;
//        System.out.println(b[2]);
//        System.out.println(a[2]);

    }
}
