package com.LiKou.simple.wuyuefen2022;

/**
 * 使用最小花费爬楼梯
 * <p>
 * 动态规划的思想
 */
public class title746 {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        int dp[] = new int[cost.length + 1];//dp[i]定义的是到达第i层的花费 注意一共有cost.length+1层
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
