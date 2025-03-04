package com.huydong.leetcode.easy.linked_list_cycle;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedListCycleSolution {
    public boolean hasCycle(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return false;
        }
        ListNode index = new ListNode();
        while (Objects.nonNull(head)) {
            ListNode tmp = head;
            head = head.next;
            if (tmp.next == index){
                return true;
            } else {
                tmp.next = index;
            }

        }
        return false;
    }
}
