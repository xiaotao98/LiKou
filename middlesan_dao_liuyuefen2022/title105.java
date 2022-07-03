package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 *从前序与中序遍历序列构造二叉树
 *
 * 思路：前序第一个节点是根节点  然后在中序中找到根节点的位置i
 * 那么中序下标为  0-(i-1) 的是左子树  i+1到末尾为右子树
 * 前序中下标为 1 - i的是左子树 i+1到末尾为右子树
 */
public class title105 {

    /*
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {//找到根节点在中序中的位置i
                //左子树的区间：先序序列[1,i] 中序序列[0,i-1]
                root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                //右子树的区间：先序序列[i+1,pre.length] 中序序列[i+1,inorder.length]
                root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                break;
            }
        }
        return root;
    }
    */


}
