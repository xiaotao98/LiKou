package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 回文子串的个数
 * <p>
 * 才懂动态规划的思想：  判断是否是回文子串   关键在于条件s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])
 * (s.charAt(i)==s.charAt(j) 时，当元素个数为1,2,3个时，一定为回文子串，或者就是dp[i+1][j-1]是回文串，则dp[i][j]也一定是回文子串
 */
public class title647 {
    public static void main(String[] args) {

    }

    /**
     * 填满dp这个矩阵的上三角即可
     */
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        boolean dp[][] = new boolean[n][n];// dp[i][j] 表示[i,j]的字符是否为回文子串
        for (int i = n - 1; i >= 0; i--) {// 注意，外层循环要倒着写，内层循环要正着写   因为要求dp[i][j] 需要知道dp[i+1][j-1]
            for (int j = i; j < n; j++) {// (s.charAt(i)==s.charAt(j) 时，当元素个数为1,2,3个时，一定为回文子串
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
