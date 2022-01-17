package dailytraining;

import java.util.LinkedList;

/**
 * @name: 简化路径
 * @link: https://leetcode-cn.com/problems/simplify-path/
 * @author: taoyouwei
 * @date: 2022/1/6
 **/
public class Solution71 {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        LinkedList<String> pathQueue = new LinkedList<>();
        StringBuilder fianlPath = new StringBuilder();

        for (String subPath : paths) {
            if (subPath.equals(".")) {

            } else if (subPath.equals("..")) {
                if (!pathQueue.isEmpty()) {
                    pathQueue.removeLast();
                }

            } else if (subPath.equals("")) {

            } else {
                pathQueue.add(subPath);
            }

        }
        if (pathQueue.isEmpty()) {
            return "/";
        }
        pathQueue.forEach(ele -> {
            fianlPath.append("/").append(ele);
        });
        return fianlPath.toString();
    }
}
