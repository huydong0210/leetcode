package com.huydong.leetcode;

import com.huydong.leetcode.add_two_numbers.AddTwoNumbersSolution;
import com.huydong.leetcode.add_two_numbers.ListNode;

public class Main {
    public static void main(String[] args) {
        AddTwoNumbersSolution addTwoNumbersSolution =new AddTwoNumbersSolution();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(3, new ListNode(0));
        ListNode result = addTwoNumbersSolution.addTwoNumbers(l1, l2);
        while (result!= null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
