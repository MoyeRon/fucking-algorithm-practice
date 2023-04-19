package tree;

import common.TreeNode;
import common.TreeNodeUtils;
import org.junit.Test;

public class Solution297Test {

    @Test
    public void serialize() {

    }

    @Test
    public void deserialize() {
        Codec codec = new Codec();
        TreeNode deserialize = codec.deserialize("12##34##5##");
    }
}