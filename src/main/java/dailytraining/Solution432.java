package dailytraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 * @name: 全 O(1) 的数据结构
 * @link: https://leetcode-cn.com/problems/all-oone-data-structure/
 * @author: taoyouwei
 * @date: 2022/3/16
 **/
public class Solution432 {
    public static void main(String[] args) {
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("hello");
        System.out.println(allOne.getMaxKey()); // 返回 "hello"
        System.out.println(allOne.getMinKey()); // 返回 "hello"
        allOne.inc("leet");
        System.out.println(allOne.getMaxKey()); // 返回 "hello"
        System.out.println(allOne.getMinKey()); // 返回 "leet"
    }

}


class AllOne {
    Map<String, Integer> string2TimesMap;
    TreeMap<Integer, HashSet<String>> times2StringMap;

    public AllOne() {
        string2TimesMap = new HashMap<>();
        times2StringMap = new TreeMap<>();

    }

    public void inc(String key) {
        int oldTimes = string2TimesMap.getOrDefault(key, 0);
        string2TimesMap.put(key, oldTimes + 1);
        if (oldTimes != 0) {
            times2StringMap.get(oldTimes).remove(key);
            if (times2StringMap.get(oldTimes).isEmpty()) {
                times2StringMap.remove(oldTimes);
            }
        }
        if (times2StringMap.containsKey(oldTimes + 1)) {
            times2StringMap.get(oldTimes + 1).add(key);
        } else {
            HashSet<String> newSet = new HashSet<>();
            newSet.add(key);
            times2StringMap.put(oldTimes + 1, newSet);
        }

    }

    public void dec(String key) {
        int currentTimes = string2TimesMap.get(key);
        string2TimesMap.put(key, currentTimes - 1);
        times2StringMap.get(currentTimes).remove(key);
        if (times2StringMap.get(currentTimes).isEmpty()) {
            times2StringMap.remove(currentTimes);
        }
        if (currentTimes == 1) {
            return;
        }
        if (times2StringMap.containsKey(currentTimes - 1)) {
            times2StringMap.get(currentTimes - 1).add(key);
        } else {
            HashSet<String> newSet = new HashSet<>();
            newSet.add(key);
            times2StringMap.put(currentTimes - 1, newSet);

        }
    }

    public String getMaxKey() {
        if (times2StringMap.isEmpty()) {
            return "";
        }
        return times2StringMap.lastEntry().getValue().iterator().next();

    }

    public String getMinKey() {
        if (times2StringMap.isEmpty()) {
            return "";
        }
        return times2StringMap.firstEntry().getValue().iterator().next();
    }
}
