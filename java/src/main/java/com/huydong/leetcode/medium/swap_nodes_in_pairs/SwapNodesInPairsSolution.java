package com.huydong.leetcode.medium.swap_nodes_in_pairs;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.awt.*;
import java.util.Objects;

public class SwapNodesInPairsSolution {
    public ListNode swapPairs(ListNode head) {
        ListNode pointer = head;
        while (Objects.nonNull(pointer)) {

            if (head == pointer) {
                ListNode index = pointer.next;
                if (Objects.nonNull(index)) {
                    ListNode tmp = index.next;
                    index.next = pointer;
                    pointer.next = tmp;
                    if (head == pointer) {
                        head = index;
                    }
                } else {
                    break;
                }
            } else {
                if (Objects.nonNull(pointer.next) && Objects.nonNull(pointer.next.next)) {
                    ListNode a = pointer.next;
                    ListNode b = a.next;
                    ListNode index = b.next;
                    b.next = a;
                    a.next = index;
                    pointer.next = b;

                    pointer = pointer.next;
                    pointer = pointer.next;
                } else {
                    pointer = pointer.next;
                }

            }

        }

        return head;

    }
}
