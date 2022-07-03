package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 打家劫舍
 * <p>
 * 思路：动态规划   dp 方程 dp[i] = max(dp[i-2]+nums[i], dp[i-1])
 */
public class title198 {

    public static void main(String[] args) {
        int nnums[] = {2,1,1,2};
        int rob = rob(nnums);
        System.out.println(rob);
    }

    public static int rob(int[] nums) {
        int dp[] = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

}
