package backtrace;

import java.util.List;

/**
 * @name: 回溯算法框架
 * @link: https://labuladong.gitee.io/algo/1/4/
 * @author: taoyouwei
 * @date: 2021/9/2
 **/
public class backTraceDemo {

    // 结果
    public List<List<Integer>> result;

    // path:路径
    // selectList:选择列表
    public void backtrace(List<Integer> path, int[] selectList) {
        // 如果满足条件
        if (true) {
            result.add(path);
            return;
        }

        for (int select : selectList) {
            //do select 做选择
            backtrace(path, selectList);
            //undo select 撤销选择
        }

    }

}
