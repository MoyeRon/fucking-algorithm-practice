package searchtree;

import common.TreeNode;
import common.TreeNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution701Test {

    Solution701 solution701 = new Solution701();

    @Test
    public void insertIntoBSTTest() {
        TreeNode node = TreeNodeUtils.treeGen(new String[]{"4", "2", "7", "1", "3"});
        solution701.insertIntoBST(node, 5);
        System.out.println();
    }
}