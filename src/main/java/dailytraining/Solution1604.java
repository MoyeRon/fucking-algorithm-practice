package dailytraining;

import java.util.*;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/9
 **/
public class Solution1604 {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, Set<Integer>> keyMap = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            if (keyMap.containsKey(name)) {
                keyMap.get(name).add(trans(keyTime[i]));
            } else {
                Set<Integer> time = new TreeSet<>();
                time.add(trans(keyTime[i]));
                keyMap.put(name, time);
            }
        }
        Set<String> result = new TreeSet<>();
        keyMap.forEach((name, times) -> {
            if (times.size() < 3) {
                return;
            }
            int[] sortTimes = Arrays.stream(times.toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();
            for (int i = 0; i + 2 < sortTimes.length; i++) {
                if (sortTimes[i + 2] - sortTimes[i] <= 60) {
                    result.add(name);
                }
            }
        });
        return new ArrayList<>(result);
    }

    private int trans(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
