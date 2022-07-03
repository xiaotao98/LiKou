package com.LiKou.simple.wuyuefen2022;

/**
 * 平衡二叉树
 * <p>
 * 思路：利用递归的思想，求出左右子树的高度，看是否符合要求
 */
public class title110 {

    /*public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {//判断根节点
            return false;
        }
        //isBalanced(root.left);
        //isBalanced(root.right);
        return isBalanced(root.left) && isBalanced(root.right);//判断左右子树
    }

    public int depth(TreeNode root) {//求树的高度
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }*/
}
