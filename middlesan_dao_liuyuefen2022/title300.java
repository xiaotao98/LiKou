package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 最长递增子序列
 * <p>
 * 思路：动态规划
 */
public class title300 {

    public static int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length]; //dp[i]:前i个元素且以num[i]结尾的最长递增序列的长度
        int max = 1;
        for (int i = 0; i < dp.length; i++) {
            dp[i]=1;//初始化：最长递增子序列最短也得是1
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){ // 递增情况下：取最大递增子序列长度
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            if (dp[i]>max){// 每个数更新完毕后随时更新最大子序列长度
                max=dp[i];
            }
        }
        return max;
    }

}
