package dailytraining;

import common.ListNode;

import java.util.Random;

/**
 * @name: 链表随机节点
 * @link: https://leetcode-cn.com/problems/linked-list-random-node/
 * @author: taoyouwei
 * @date: 2022/1/16
 **/
public class Solution382 {

    ListNode head;
    ListNode tail;
    ListNode current;
    Random random = new Random();
    int length = 1;

    public Solution382(ListNode head) {
        this.head = head;
        current = this.head;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        tail = current;
        current = head;
    }

    public int getRandom() {
        int step = Math.abs(random.nextInt() % length);
        for (int i = 0; i < step; i++) {
            if (current == tail) {
                current = head;
            } else {
                current = current.next;
            }
        }
        return current.val;
    }
}
