package dailytraining;

import org.junit.Test;

import common.ListNode;
import common.ListNodeUtils;

public class Solution1669Test {
    @Test
    public void testMergeInBetween() {
        Solution1669 solution1669 = new Solution1669();
        ListNode l1 = ListNodeUtils.generate(new int[] { 0, 1, 2, 3, 4, 5 });
        ListNode l2 = ListNodeUtils.generate(new int[] { 1000000, 1000001, 1000002 });
        ListNode result = solution1669.mergeInBetween(l1, 3, 4, l2);
    }
}
