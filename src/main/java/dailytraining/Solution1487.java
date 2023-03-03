package dailytraining;

import java.util.*;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/3
 **/
public class Solution1487 {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> resultNames = new HashMap<>();
        List<String> result = new LinkedList<>();
        for (String name : names) {
            if (resultNames.containsKey(name)) {
                int next = resultNames.get(name);
                while (resultNames.containsKey(suffix(name, next))) {
                    next++;
                }
                result.add(suffix(name, next));
                resultNames.put(suffix(name, next), 1);
                resultNames.put(name, next + 1);
            } else {
                resultNames.put(name, 1);
                result.add(name);
            }
        }
        return result.toArray(new String[0]);
    }

    private String suffix(String name, int next) {
        String newName = name + "(%s)";
        return String.format(newName, next);
    }
}
