package singlelinkedlist;

import common.ListNode;

/**
 * @name: 环形链表
 * @link: https://leetcode-cn.com/problems/linked-list-cycle/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
