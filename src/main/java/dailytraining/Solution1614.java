package dailytraining;

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
