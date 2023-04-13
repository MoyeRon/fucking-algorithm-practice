package dailytraining;

import org.junit.Assert;
import org.junit.Test;

public class Solution1041Test {

    @Test
    public void isRobotBoundedTest() {
        Solution1041 solution = new Solution1041();
        Assert.assertTrue(solution.isRobotBounded("GGLLGG"));
    }
}