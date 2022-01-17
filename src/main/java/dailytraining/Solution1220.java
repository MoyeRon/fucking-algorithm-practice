package dailytraining;


public class Solution1220 {


    public int countVowelPermutation(int n) {
        if (n == 1) {
            return 5;
        }
        int aPre = 1, ePre = 1, iPre = 1, oPre = 1, uPre = 1;
        int mod = 1000000000 + 7;
        for (int i = 2; i <= n; i++) {
            int aCurrent = ePre;
            int eCurrent = (aPre + iPre) % mod;
            int iCurrent = ((aPre + ePre) % mod + (oPre + uPre) % mod) % mod;
            int oCurrent = (iPre + uPre) % mod;
            int uCurrent = aPre;

            aPre = aCurrent;
            ePre = eCurrent;
            iPre = iCurrent;
            oPre = oCurrent;
            uPre = uCurrent;
        }
        return (((aPre + ePre) % mod + (iPre + oPre) % mod) % mod + uPre) % mod;
    }

}
