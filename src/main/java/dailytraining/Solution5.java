package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/10/27
 **/
public class Solution5 {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String a = palindrome(s, i, i);
            String b = palindrome(s, i, i + 1);
            if (a.length() > b.length()) {
                if (result.length() < a.length()) {
                    result = a;
                }
            } else {
                if (result.length() < b.length()) {
                    result = b;
                }
            }
        }
        return result;
    }

    private String palindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
