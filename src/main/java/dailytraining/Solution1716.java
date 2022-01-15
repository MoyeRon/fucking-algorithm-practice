package dailytraining;


public class Solution1716 {
    public int totalMoney(int n) {
        if (n < 8) {
            return (1 + n) * n / 2;
        }
        int weeks = (1 + 7) * 7 / 2;
        int round = n / 7;
        int last = n % 7;
        return (weeks + (weeks + 7 * (round - 1))) * round / 2 + ((1 + round) + (round + last)) * last / 2;
    }
}
