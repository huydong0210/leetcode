package com.huydong.leetcode.medium.sort_list;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SortListSolution {
    public ListNode sortList(ListNode head) {
        List<Integer> input = new ArrayList<>();
        while (head != null) {
            input.add(head.val);
            head = head.next;
        }
        if (input.size() ==0){
            return null;
        }
        sort(input);
        ListNode result = new ListNode();
        ListNode pointer = result;
        for (int i = 0; i <input.size(); i++) {
            pointer.val = input.get(i);
            if (i+1 < input.size()){
                pointer.next = new ListNode();
            }
            pointer = pointer.next;
        }

        return result;
    }

    public void sort(List<Integer> list) {
        if (list.size() == 0) {
            return;
        }
        int min = list.get(0);
        int max = list.get(0);
        int[] result = new int[list.size()];
        for (int i : list) {
            min = min < i ? min : i;
            max = max > i ? max : i;
        }
        int[] tmp = new int[max - min + 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            tmp[list.get(i) - min] += 1;
        }
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = tmp[i] + tmp[i - 1];
        }
        for (int i : list) {
            result[tmp[i - min] - 1] = i;
            tmp[i - min] -= 1;
        }

        for (int i = 0; i < result.length; i++) {
            list.set(i, result[i]);
        }
    }
}
