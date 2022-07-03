package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Arrays;

/**
 * 零钱兑换
 *
 * 动态规划
 */
public class title322 {
    public static void main(String[] args) {
        int[] coins = {1};
        int i = coinChange(coins, 0);
        System.out.println(i);
    }

    public static int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {//第一个条件：钱>=硬币面值  第二个条件：判断用了一个硬币后，剩余钱能否凑整
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
    }
}
