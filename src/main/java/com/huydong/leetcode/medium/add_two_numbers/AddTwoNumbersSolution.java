package com.huydong.leetcode.medium.add_two_numbers;

public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode index = result;
        int remember = 0;
        while (l1 != null || l2 != null) {
            int sum = remember;
            sum += l1 != null ? l1.val : 0;
            sum += l2 != null ? l2.val : 0;
            index.val = sum % 10;
            if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
                index.next = new ListNode();
                index = index.next;
            }
            remember = sum >= 10 ? 1 : 0;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
        }
        if (remember > 0) {
            index.next = new ListNode();
            index = index.next;
            index.val = 1;
        }
        return result;
    }
}
