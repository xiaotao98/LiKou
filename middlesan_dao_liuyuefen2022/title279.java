package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 完全平方数
 * <p>
 * 思路：动态规划    dp[i] = Math.min(dp[i], dp[i - j * j] + 1)
 */
public class title279 {

    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int sqrt = (int) Math.sqrt(n);//符合要求的平方数只会出现在 1-sqrt(n) 中
            for (int j = 1; j <= sqrt; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

}
