package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 乘积最大子数组
 * <p>
 * 思路：动态规划   dp[i]代表数组前 i+1 乘积最大子数组的数值。
 * dp[i]=max(dp[i-1],包含数组下标为i的乘积最大值)
 */
public class title152 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, -1};
        int i = maxProduct(nums);
        System.out.println(i);
    }

    public static int maxProduct(int[] nums) {
        int dp[] = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            int max = nums[i];//max记录的是带nums[i]的乘积最大子数组数值
            int contain_i = nums[i], k = i - 1;
            while (k >= 0) {
                contain_i = contain_i * nums[k];
                max = Math.max(max, contain_i);
                k--;
            }
            dp[i] = Math.max(dp[i - 1], max);
        }
        return dp[dp.length - 1];
    }
}
