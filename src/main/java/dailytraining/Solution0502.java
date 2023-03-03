package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/2
 **/
public class Solution0502 {
    public String printBin(double num) {
        StringBuilder bin = new StringBuilder("0.");
        for (int i = 0; i < 6; ++i) {
            num *= 2;
            if (num < 1)
                bin.append('0');
            else {
                bin.append('1');
                if (--num == 0)
                    return bin.toString();
            }
        }
        return "ERROR";
    }
}
