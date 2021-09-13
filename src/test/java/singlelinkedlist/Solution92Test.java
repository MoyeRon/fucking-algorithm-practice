package singlelinkedlist;

import common.ListNode;
import common.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution92Test {
    Solution92 solution92 = new Solution92();

    @Test
    public void reverseBetweenTest() {
        ListNode head = ListNodeUtils.generate(new int[]{1, 2, 3, 4, 5});
        solution92.reverseBetween(head, 2, 4);
    }

}