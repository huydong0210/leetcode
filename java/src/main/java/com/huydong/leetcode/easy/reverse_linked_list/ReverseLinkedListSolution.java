package com.huydong.leetcode.easy.reverse_linked_list;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.util.Objects;

public class ReverseLinkedListSolution {
    public ListNode reverseList(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        ListNode result = null;
        while (Objects.nonNull(head)) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = result;
            result = tmp;
        }
        return result;
    }
}
