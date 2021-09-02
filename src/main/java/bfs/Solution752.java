package bfs;

import java.util.*;

/**
 * @name: 打开转盘锁
 * @link: https://leetcode-cn.com/problems/open-the-lock/
 * @author: taoyouwei
 * @date: 2021/9/3
 **/
public class Solution752 {

    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        if (deads.contains(target)) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int count = 0;
        queue.add("0000");
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (deads.contains(current)) {
                    continue;
                }
                if (visited.contains(current)) {
                    continue;
                }
                if (current.equals(target)) {
                    return count;
                }
                visited.add(current);
                List<String> next = nextPassword(current);
                queue.addAll(next);
            }
            count++;
        }
        return -1;
    }

    public List<String> nextPassword(String password) {
        List<String> newPassword = new LinkedList<>();
        char[] passwordChars = password.toCharArray();
        for (int i = 0; i < 4; i++) {
            char old = passwordChars[i];
            char up = (char) (((passwordChars[i] - '0' + 1) % 10) + '0');
            char down = (char) (((passwordChars[i] - '0' + 9) % 10) + '0');
            passwordChars[i] = up;
            newPassword.add(new String(passwordChars));
            passwordChars[i] = down;
            newPassword.add(new String(passwordChars));
            passwordChars[i] = old;
        }
        return newPassword;
    }
}
