package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 删除给定值的叶子节点
 * <p>
 * 思路：先删除左子树和右子树节点  然后再判断根节点是否可以删除
 */
public class title1325 {

   /*
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        root = delete(root, target);
        return root;
    }

    public TreeNode delete(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        root.left = delete(root.left, target);//删除左子树符合条件的叶子节点
        root.right = delete(root.right, target);//删除右子树符合条件的叶子节点
        if (root.left == null && root.right == null && root.val == target) {//判断根节点是否可以删除
            return null;
        }
        return root;
    }
    */
}
