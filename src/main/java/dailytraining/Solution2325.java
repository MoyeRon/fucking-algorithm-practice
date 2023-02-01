package dailytraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/1
 **/
public class Solution2325 {
    public String decodeMessage(String key, String message) {
        Set<Character> usedSet = new HashSet<>();
        Map<Character, Character> mapping = new HashMap<>();

        char[] chars = key.toCharArray();
        for (int i = 0, count = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            if (usedSet.contains(chars[i])) {
                continue;
            }
            usedSet.add(chars[i]);
            mapping.put(chars[i], (char) ('a' + count));
            count++;
        }
        char[] encodedChars = message.toCharArray();
        char[] decodedChars = new char[encodedChars.length];
        for (int i = 0; i < encodedChars.length; i++) {
            if (encodedChars[i] == ' ') {
                decodedChars[i] = ' ';
                continue;
            }
            decodedChars[i] = mapping.get(encodedChars[i]);
        }
        return new String(decodedChars);
    }
}
