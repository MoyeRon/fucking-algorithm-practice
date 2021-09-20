package searchtree;

import common.TreeNode;
import common.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution230Test {
    Solution230 solution230 = new Solution230();

    @Test
    public void kthSmallestTest() {
        TreeNode node = TreeNodeUtils.treeGen(new int[]{4, 2, 5, -1, 3});
        int i = solution230.kthSmallest(node, 1);
        System.out.println(i);
    }
}