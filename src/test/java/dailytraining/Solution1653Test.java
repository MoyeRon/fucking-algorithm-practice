package dailytraining;

import org.junit.Assert;
import org.junit.Test;

public class Solution1653Test {

    @Test
    public void minimumDeletionsTest() {
        Solution1653 solution = new Solution1653();
        Assert.assertEquals(2, solution.minimumDeletions("aababbab"));
        Assert.assertEquals(2, solution.minimumDeletions("bbaaaaabb"));

    }
}