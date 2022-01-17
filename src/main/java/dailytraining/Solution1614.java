package dailytraining;

/**
 * @name: 括号的最大嵌套深度
 * @link: https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 * @author: taoyouwei
 * @date: 2022/1/7
 **/
public class Solution1614 {
    public int maxDepth(String s) {
        int leftSize = 0;
        char[] chars = s.toCharArray();
        int length = 0;
        for (char c : chars) {
            if (c == '(') {
                leftSize++;
                length = Math.max(leftSize, length);
            }
            if (c == ')') {
                leftSize--;
            }
        }
        return length;
    }
}
