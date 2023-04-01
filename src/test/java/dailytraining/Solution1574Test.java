package dailytraining;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1574Test {

    @Test
    public void findLengthOfShortestSubarrayTest() {
        Solution1574 solution1574 = new Solution1574();
        Assert.assertEquals(3, solution1574.findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2, 3, 5}));
    }
}