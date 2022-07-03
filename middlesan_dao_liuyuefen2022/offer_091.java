package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 粉刷房子
 * <p>
 * 思路：如果当前房子选了颜色0，那么就在下一个房子选择颜色1或者颜色2，选择其中价格低的那个即可。
 * 由于诸多不确定性，所以设置一个二维数组dp[][] = new int[len][3];  目的就是为了计算所有的可能性，然后最后选择数组最后一行最小的那个数
 */
public class offer_091 {

    public int minCost(int[][] costs) {
        int len = costs.length;
        int dp[][] = new int[len][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];
        for (int i = 1; i < len; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        int min = Math.min(dp[len - 1][0], dp[len - 1][1]);
        return Math.min(min, dp[len - 1][2]);
    }

}
