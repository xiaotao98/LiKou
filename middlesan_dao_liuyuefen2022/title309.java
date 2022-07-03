package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 最佳买卖股票时机含冷冻期
 */
public class title309 {
    public static int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][4];
        dp[0][0] = 0;//没有股票，没卖出
        dp[0][1] = 0;//没有股票，卖出去了
        dp[0][2] = -1 * prices[0];//有股票，今天买的
        dp[0][3] = -1 * prices[0];//有股票，不是今天买的
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);//没有股票，没卖出
            dp[i][1] = Math.max(dp[i - 1][2], dp[i - 1][3]) + prices[i];//没有股票，卖出去了
            dp[i][2] = dp[i - 1][0] - prices[i];//今天买的   前一天  一定无且没卖
            dp[i][3] = Math.max(dp[i - 1][2], dp[i - 1][3]);//今天没买  却持有  前一天继承过来的
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }
}
