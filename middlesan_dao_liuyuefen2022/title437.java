package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 路径总和 III
 *
 * 思路：两个递归
 */
public class title437 {

    /*
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return count;
        }
        count(root, targetSum);//根节点递归
        pathSum(root.left, targetSum);//左子树递归
        pathSum(root.right, targetSum);//右子树递归
        return count;
    }

    public void count(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        if (targetSum - root.val == 0) {
            count++;
        }
        count(root.left, targetSum - root.val);
        count(root.right, targetSum - root.val);
    }
    */

}
