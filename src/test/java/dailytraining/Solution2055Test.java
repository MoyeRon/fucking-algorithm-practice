package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2055Test {
    Solution2055 solution = new Solution2055();

    @Test
    public void platesBetweenCandlesCase1() {
        solution.platesBetweenCandles("**|**|***|", new int[][]{{2, 5}, {5, 9}});
    }

    @Test
    public void platesBetweenCandlesCase2() {
        solution.platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1,17},{4,5},{14,17},{5,11},{15,16}});
    }
}