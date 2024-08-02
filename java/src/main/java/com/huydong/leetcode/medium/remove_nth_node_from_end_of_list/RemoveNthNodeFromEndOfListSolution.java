package com.huydong.leetcode.medium.remove_nth_node_from_end_of_list;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.util.Objects;

public class RemoveNthNodeFromEndOfListSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode pointer = head;
        while (Objects.nonNull(pointer)) {
            length++;
            pointer = pointer.next;
        }
        n = length - n + 1;
        if (n == 1) {
            return head.next;
        }
        pointer = head;
        int i = 1;
        while (i <= n) {
            if (i + 1 == n) {
                ListNode index = pointer.next;
                pointer.next = Objects.isNull(index) ? null : index.next;
                break;
            } else {
                pointer = pointer.next;
                i++;
            }
        }

        return head;
    }
}
