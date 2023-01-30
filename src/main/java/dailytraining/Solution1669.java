package dailytraining;

import common.ListNode;

public class Solution1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1;
        ListNode post = list1;
        for (int i = 0; i < a - 1; i++) {
            pre = pre.next;
        }
        for (int i = 0; i < b - 1; i++) {
            post = post.next;
        }
        ListNode l2 = list2;
        while (l2.next != null) {
            l2 = l2.next;
        }
        pre.next = list2;
        l2.next = post;
        return list1;
    }
}
