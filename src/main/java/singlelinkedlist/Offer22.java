package singlelinkedlist;

import common.ListNode;

/**
 * @name: 链表中倒数第k个节点
 * @link: https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode foreword = head;
        for (int i = 0; i < k; i++) {
            foreword = foreword.next;
        }
        ListNode node = head;
        while (foreword != null) {
            foreword = foreword.next;
            node = node.next;
        }
        return node;
    }
}
