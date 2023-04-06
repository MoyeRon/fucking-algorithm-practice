package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/4/1
 **/
public class Solution831 {
    private static final String[] PHONE_PRE = {"***-***-", "+*-***-***-", "+  **-***-***-", "+***-***-***-"};

    public String maskPII(String s) {
        if (s.contains("@")) {
            return email(s);
        } else {
            return phone(s);
        }
    }

    private String email(String mail) {
        String[] mails = mail.split("@");
        String pre = mails[0].toLowerCase();
        return pre.charAt(0) + "*****" + pre.charAt(pre.length() - 1) + "@" + mails[1].toLowerCase();
    }

    private String phone(String phone) {
        String normalPhone = phone.replaceAll("[+\\-() ]", "");
        return PHONE_PRE[normalPhone.length() - 10] + normalPhone.substring(normalPhone.length() - 4);
    }
}
