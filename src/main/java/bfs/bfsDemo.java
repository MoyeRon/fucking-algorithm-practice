package bfs;

import common.Node;

import java.util.Queue;
import java.util.Set;

/**
 * @name: bfs框架
 * @link: https://labuladong.gitee.io/algo/1/5/
 * @author: taoyouwei
 * @date: 2021/9/2
 **/
public class bfsDemo {
    public int bfs(Node start, Node target) {
        Queue<Node> q; // 核心数据结构
        Set<Node> visited; // 避免走回头路

        q.offer(start); // 将起点加入队列
        visited.add(start);
        int step = 0; // 记录扩散的步数

        while (!q.isEmpty()) {
            int sz = q.size();
            /* 将当前队列中的所有节点向四周扩散 */
            for (int i = 0; i < sz; i++) {
                Node cur = q.poll();
                /* 划重点：这里判断是否到达终点 */
                if (cur == target)
                    return step;
                /* 将 cur 的相邻节点加入队列 */
                // cur.adj() 泛指 cur 相邻的节点
                for (Node x : cur.adj())
                    if (!visited.contains(x)) {
                        q.offer(x);
                        visited.add(x);
                    }
            }
            /* 划重点：更新步数在这里 */
            step++;
        }
    }
}
