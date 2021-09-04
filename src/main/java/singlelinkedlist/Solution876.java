package singlelinkedlist;

import common.ListNode;

/**
 * @name: 链表的中间结点
 * @link: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        while (head.next != null && head.next.next != null) {
            head = head.next.next;
            mid = mid.next;
        }
        if (head.next != null) {
            mid = mid.next;
        }
        return mid;
    }
}
