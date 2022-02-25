package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1706Test {

    Solution1706 solution1706 = new Solution1706();

    @Test
    public void findBallCase1() {
        int[] ball = solution1706.findBall(new int[][]{{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}});
        System.out.println(ball);
    }

    @Test
    public void findBallCase2() {
        int[] ball = solution1706.findBall(new int[][]{{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1},{1,1,1,1,1,1},{-1,-1,-1,-1,-1,-1}});
        System.out.println(ball);
    }
}