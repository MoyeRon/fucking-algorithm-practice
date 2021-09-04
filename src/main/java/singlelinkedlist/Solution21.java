package singlelinkedlist;

import common.ListNode;

/**
 * @name: 合并两个有序链表
 * @link: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            ListNode node;
            if (l1.val < l2.val) {
                node = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                node = new ListNode(l2.val);
                l2 = l2.next;
            }
            p.next = node;
            p = p.next;
        }
        if (l1 == null) {
            p.next = l2;
        }
        if (l2 == null) {
            p.next = l1;
        }
        return dummy.next;
    }
}
