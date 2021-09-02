package backtrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @name: N皇后
 * @link: https://leetcode-cn.com/problems/n-queens/
 * @author: taoyouwei
 * @date: 2021/9/1
 **/
public class Solution51 {
    List<List<String>> result = new LinkedList<>();

    public List<List<String>> solveNQueens(int n) {
        LinkedList<String> selected = new LinkedList<>();
        return new ArrayList<>();
    }

    public void backTrace(LinkedList<String> selected, int n) {

    }

    public boolean isValid(LinkedList<String> select, int n, int x, int y) {
        char[][] board = new char[select.size()][n];
        for (int i = 0; i < select.size(); i++) {
            char[] row = select.get(i).toCharArray();
            if (n >= 0) System.arraycopy(row, 0, board[i], 0, n);
        }
        for (int i = 0; i < x; i++) {
            if (board[i][x] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < y; i++) {
            if (board[x][i] == 'Q') {
                return false;
            }
        }
        // TODO
        return false;
    }
}
