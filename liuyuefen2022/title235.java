package com.LiKou.simple.liuyuefen2022;

/**
 * 二叉搜索树的最近公共祖先
 *
 * 思路：如果根为空  直接返回   如果p，q任意一个为根节点，返回根
 * 根的左子树递归    根的右子树递归
 * 如果  左右不为空，说明p，q在左右，那么返回根，否则，谁不为空，返回谁。如果都为空，那就返回空
 */
public class title235 {

    /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {//根为空 直接返回
            return root;
        }
        if (p == root || q == root) {//只要有一个要找的节点为根节点  就返回根
            return root;
        }
        root.left = lowestCommonAncestor(root.left, p, q);//去左子树找
        root.right = lowestCommonAncestor(root.right, p, q);//去右子树找
        if (root.left != null && root.right != null) {//左右都有 返回跟
            return root;
        } else if (root.left != null) {//只有左有  返回左
            return root.left;
        } else if (root.right != null) {
            return root.right;
        }
        return null;
    }
    */

}
