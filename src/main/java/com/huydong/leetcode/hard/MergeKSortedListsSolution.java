package com.huydong.leetcode.hard;

import com.huydong.leetcode.medium.add_two_numbers.ListNode;

import java.util.Objects;

public class MergeKSortedListsSolution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return new ListNode();
        }
        ListNode result = lists[0];
        for (int i=1; i<lists.length; i++){
            result = mergeTwoLists(result, lists[i]);
        }
        return result;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        while (list1 != null || list2 != null) {
            if (Objects.nonNull(list1) && (Objects.isNull(list2) || list1.val <= list2.val)){
                pointer.next = new ListNode();
                pointer = pointer.next;
                pointer.val = list1.val;
                list1 = list1.next;

            } else {
                pointer.next = new ListNode();
                pointer = pointer.next;
                pointer.val = list2.val;
                list2 = list2.next;
            }
        }
        result = result.next;
        return result;

    }
}
