package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2373Test {

    @Test
    public void largestLocalTest() {
        Solution2373 solution = new Solution2373();
        solution.largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}});
    }
}