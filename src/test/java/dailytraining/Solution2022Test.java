package dailytraining;

import org.junit.Test;

public class Solution2022Test {
    @Test
    public void testConstruct2DArray() {
        Solution2022 solution2022 = new Solution2022();
        int[][] construct2dArray = solution2022.construct2DArray(new int[] { 1, 2, 3, 4 }, 2, 2);
        System.out.println(construct2dArray);
    }
}
