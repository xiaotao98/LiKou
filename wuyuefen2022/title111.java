package com.LiKou.simple.wuyuefen2022;

/**
 * 二叉树的最小深度
 * <p>
 * 思路：利用递归的思想
 */
public class title111 {
    /*public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.right == null) {//右子树为空，左子树不为空,取左子树那边最低的高度
            return minDepth(root.left) + 1;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(root.left, root.right) + 1;
    }*/
}
