package dailytraining;

import java.util.HashMap;
import java.util.Map;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/9
 **/
public class Solution1797 {
}

class AuthenticationManager {
    private int timeToLive;
    private Map<String, Integer> authMap;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
        authMap = new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        authMap.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (!authMap.containsKey(tokenId)) {
            return;
        }
        int oldTime = authMap.get(tokenId);
        if (oldTime <= currentTime) {
            return;
        }
        authMap.put(tokenId, currentTime + timeToLive);
    }

    public int countUnexpiredTokens(int currentTime) {
        return (int) authMap.values().stream().parallel().filter(time -> time > currentTime).count();
    }
}
