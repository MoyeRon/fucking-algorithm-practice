package dailytraining;

/**
 * @name: 复数乘法
 * @link: https://leetcode-cn.com/problems/complex-number-multiplication/
 * @author: taoyouwei
 * @date: 2022/2/25
 **/
public class Solution537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] num1s = num1.split("\\+");
        String[] num2s = num2.split("\\+");
        int nums1Real = Integer.parseInt(num1s[0]);
        int nums1Complex = Integer.parseInt(num1s[1].replace("i", ""));

        int nums2Real = Integer.parseInt(num2s[0]);
        int nums2Complex = Integer.parseInt(num2s[1].replace("i", ""));

        int resultReal = nums1Real * nums2Real - nums1Complex * nums2Complex;
        int resultComplex = nums1Real * nums2Complex + nums2Real * nums1Complex;

        return resultReal + "+" + resultComplex + "i";
    }
}
