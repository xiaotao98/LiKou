package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 打家劫舍 III
 * <p>
 * 思路：递归，分为两种情况，一个是抢根  一个是不抢根
 * 抢根   那么左右子树只能选不抢根的情况
 * 不抢根    左右子树随便选  即选最大的即可
 */
public class title337 {

    /*
    public int rob(TreeNode root) {
        int[] rst = dp(root);
        return Math.max(rst[0], rst[1]);
    }

    public int[] dp(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] left = dp(root.left);//left[0]代表不抢根时的最大值，left[1]抢根时的最大值
        int[] right = dp(root.right);
        int[] rst = new int[2];
        rst[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);//不抢根时的最大值，左右子树随便抢
        rst[1] = root.val + left[0] + right[0];//抢根时的最大值，左右子树只能选不抢根的那个
        return rst;
    }
    */
}
