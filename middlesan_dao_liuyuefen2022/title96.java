package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 不同的二叉搜索树
 * <p>
 * 思路：动态规划，n个节点   分别用1-n作为根节点时讨论
 */
public class title96 {

    public int numTrees(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {//根节点分别为1，2.。。。i时
                dp[i] = dp[i] + dp[i - j] * dp[j - 1];// 左子树节点数 j-1   右子树节点数 i-j
            }
        }
        return dp[n];
    }
}
