package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution661Test {
    Solution661 solution = new Solution661();

    @Test
    public void imageSmootherCase1() {
        int[][] imageSmoother = solution.imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}});
        System.out.println(imageSmoother);
    }

    @Test
    public void imageSmootherCase2() {
        int[][] imageSmoother = solution.imageSmoother(new int[][]{{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}});
        System.out.println(imageSmoother);
    }
}