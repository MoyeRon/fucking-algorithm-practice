package dailytraining;

/**
 * @name: 简易银行系统
 * @link: https://leetcode-cn.com/problems/simple-bank-system/
 * @author: taoyouwei
 * @date: 2022/3/18
 **/
public class Solution2043 {
}

class Bank {
    long[] banks;

    public Bank(long[] balance) {
        banks = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (!(isAccount(account1) && isAccount(account2))) {
            return false;
        }
        if (banks[account1 - 1] < money) {
            return false;
        }
        banks[account1 - 1] -= money;
        banks[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (!isAccount(account)) {
            return false;
        }
        banks[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (!isAccount(account)) {
            return false;
        }
        if (money > banks[account - 1]) {
            return false;
        }
        banks[account - 1] -= money;
        return true;
    }

    private boolean isAccount(int account) {
        return account > 0 && account - 1 < banks.length;
    }
}
