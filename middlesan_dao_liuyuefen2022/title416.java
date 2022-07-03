package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 分割等和子集
 * <p>
 * 思路：首先计算数组总和sum，如果sum为奇数，直接false。需要找子集使得子集的和为aid=sum/2
 * dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);   dp[j]代表当前背包容量为j的时候，可以获取的最大价值
 */
public class title416 {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int aid = sum / 2;
        int dp[] = new int[aid + 1];//dp[j]代表当前背包容量为j的时候，可以获取的最大价值
        for (int i = 0; i < nums.length; i++) {//物品从小到大
            for (int j = aid; j > 0; j--) {//背包从大到小
                if (j >= nums[i]) {//当前背包容量大于物品
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                    if (dp[j] == aid) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
