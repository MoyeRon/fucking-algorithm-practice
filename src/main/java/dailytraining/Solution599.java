package dailytraining;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @name: 两个列表的最小索引总和
 * @link: https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * @author: taoyouwei
 * @date: 2022/3/14
 **/
public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i], i);
        }
        Map<String, Integer> commonMap = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            if (list1Map.containsKey(list2[i])) {
                commonMap.put(list2[i], i + list1Map.get(list2[i]));
            }
        }
        int minIndex = commonMap.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();

        return commonMap.entrySet().stream().filter(entry -> entry.getValue() == minIndex).map(Map.Entry::getKey).toArray(String[]::new);
    }
}
