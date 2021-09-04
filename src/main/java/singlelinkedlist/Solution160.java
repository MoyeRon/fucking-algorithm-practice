package singlelinkedlist;

import common.ListNode;

/**
 * @name: 相交链表
 * @link: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            if (nodeA == null) {
                nodeA = headB;
            } else {
                nodeA = nodeA.next;
            }
            if (nodeB == null) {
                nodeB = headA;
            } else {
                nodeB = nodeB.next;
            }
        }
        return nodeA;
    }
}
