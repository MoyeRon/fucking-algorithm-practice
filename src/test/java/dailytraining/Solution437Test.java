package dailytraining;

import common.TreeNode;
import common.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution437Test {

    @Test
    public void pathSum() {
        TreeNode treeNode = TreeNodeUtils.treeGen(new String[]{"10", "5", "-3", "3", "2", "null", "11", "3", "-2", "null", "1"});
        Solution437 solution = new Solution437();
        int i = solution.pathSum(treeNode, 8);
        System.out.println(i);
    }
}