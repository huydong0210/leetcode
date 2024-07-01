package com.huydong.leetcode.medium.add_two_numbers;

import java.util.List;
import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public static ListNode createListNode(List<Integer> list){
        ListNode result = new ListNode();
        ListNode pointer = result;
        for (Integer element : list){
            pointer.next = new ListNode();
            pointer = pointer.next;
            pointer.val = element;
        }
        result = result.next;
        return result;
    }

    public static String print(ListNode input ){
        StringBuilder result = new StringBuilder();
        while (input!=null){
            result.append(input.val).append(" ");
            input = input.next;
        }
        return result.toString();
    }
}
