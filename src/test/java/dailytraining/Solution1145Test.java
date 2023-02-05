package dailytraining;

import common.TreeNode;
import common.TreeNodeUtils;
import junit.framework.TestCase;

public class Solution1145Test extends TestCase {

    public void testBtreeGameWinningMove() {
        TreeNode treeNode = TreeNodeUtils.treeGen(new String[]{"1", "2", "3", "4", "5"});
        Solution1145 solution1145 = new Solution1145();
        solution1145.btreeGameWinningMove(treeNode, 5, 2);
    }
}