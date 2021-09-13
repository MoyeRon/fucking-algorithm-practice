package common;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2021/9/9
 **/
public class ListNodeUtils {

    public static ListNode generate(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            current.next = node;
            current = current.next;
        }
        return head;
    }
}
