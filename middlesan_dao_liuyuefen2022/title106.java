package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 从中序与后序遍历序列构造二叉树
 * <p>
 * 思路：后序最后一个节点是根节点  然后在中序中找到根节点的位置i
 * 那么中序下标为  0-(i-1) 的是左子树  i+1到末尾为右子树
 * 后序中下标为 0-(i-1) 的是左子树 i到（末尾-1）为右子树
 */
public class title106 {

    /*
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]) {
                root.left = buildTree(Arrays.copyOfRange(inorder, 0, i), Arrays.copyOfRange(postorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(inorder, i + 1, inorder.length), Arrays.copyOfRange(postorder, i, postorder.length - 1));
                break;
            }
        }
        return root;
    }
    */

}
