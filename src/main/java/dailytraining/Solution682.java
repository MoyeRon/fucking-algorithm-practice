package dailytraining;

import java.util.Stack;

/**
 * @name: 棒球比赛
 * @link: https://leetcode-cn.com/problems/baseball-game/
 * @author: taoyouwei
 * @date: 2022/3/26
 **/
public class Solution682 {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            int core = 0;
            if (op.equals("+")) {
                int pre = stack.pop();
                int prePre = stack.peek();
                core = pre + prePre;
                sum += core;
                stack.push(pre);
                stack.push(core);
            } else if (op.equals("D")) {
                core = stack.peek() * 2;
                sum += core;
                stack.push(core);
            } else if (op.equals("C")) {
                sum -= stack.pop();
            } else {
                core = Integer.parseInt(op);
                sum += core;
                stack.push(core);
            }
        }
        return sum;
    }
}
