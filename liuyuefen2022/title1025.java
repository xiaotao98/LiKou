package com.LiKou.simple.liuyuefen2022;

/**
 * 除数博弈
 *
 * 思路1：目前数n  然后计算n除自身外所有因子，也就是可能选择的数j，然后看是否有 dp[i-j] == false   有的话  dp[i]=true
 *
 * 思路2：偶数必胜，奇数必败
 */
public class title1025 {

    public boolean divisorGame(int n) {
        if (n == 1) {
            return false;
        }
        boolean dp[] = new boolean[n + 1];
        dp[2] = true;
        for (int i = 3; i < dp.length; i++) {
            boolean flag = false;
            for (int j = 1; j < i; j++) {
                if (i%j==0&&dp[i-j] == false) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                dp[i] = true;
            }
        }
        return dp[n];
    }
}
