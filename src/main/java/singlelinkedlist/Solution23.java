package singlelinkedlist;

import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @name: 合并K个升序链表
 * @link: https://leetcode-cn.com/problems/merge-k-sorted-lists/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        while (!queue.isEmpty()) {
            ListNode min = queue.poll();
            p.next = new ListNode(min.val);
            p = p.next;
            if (min.next != null) {
                queue.add(min.next);
            }
        }
        return dummy.next;
    }

}
