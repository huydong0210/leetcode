package com.huydong.leetcode.easy.linked_list_cycle;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import javax.management.ObjectName;
import java.io.ObjectStreamException;
import java.util.Objects;

public class LinkedListCycleSolution2 {

    public boolean hasCycle(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
