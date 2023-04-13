package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/4/11
 **/
public class Solution1041 {
    private int[] pos;

    private final int[][] directions = new int[][]{
            {1, 0},
            {0, 1},
            {-1, 0},
            {0, -1}
    };
    private int dir;

    public boolean isRobotBounded(String instructions) {
        init();
        for (char cmd : instructions.toCharArray()) {
            if (cmd == 'G') {
                int[] direction = directions[dir];
                pos[0] += direction[0];
                pos[1] += direction[1];
            } else if (cmd == 'L') {
                dir = (dir + 1) % 4;
            } else {
                dir = (dir + 3) % 4;
            }
        }
        if (pos[0] == 0 && pos[1] == 0) {
            return true;
        }
        return dir != 1;

    }

    private void init() {
        pos = new int[]{0, 0};
        dir = 1;
    }
}
