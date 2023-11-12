package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution300Test {

    @Test
    public void lengthOfLIS() {
        Solution300 solution300 = new Solution300();
        int i = solution300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        System.out.println(i);
    }
}