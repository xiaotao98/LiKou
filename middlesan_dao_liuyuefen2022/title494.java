package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 目标和
 *
 * 思路：直接dfs递归
 */
public class title494 {

    int rst = 0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return rst;
    }

    public void dfs(int[] nums, int target, int start, int sum) {//start是nums的开始下标，sum是和
        if (start == nums.length) {//遍历完了
            if (sum == target) {//判断和是否等于target
                rst++;
            }
            return;
        }
        dfs(nums, target, start + 1, sum + nums[start]);//加上当前数
        dfs(nums, target, start + 1, sum - nums[start]);//减去当前数
    }

}
