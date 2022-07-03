package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 根据前序和后序遍历构造二叉树
 * <p>
 * 思路：前序第一个节点是根节点  去后序中找根节点后的那个节点位置i   左分支共有 L=i+1 个点
 * 左子树值： 前序中 1 - （L+1）   后序 0-L
 * 右子树值：前序  （L+1）-末尾    后序  L -（末尾-1）
 */
public class title889 {

    /*
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder.length == 0 || postorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1 || postorder.length == 1) {
            return root;
        }
        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == preorder[1]) {
                int L = i + 1;//左分支所有节点
                root.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, L + 1), Arrays.copyOfRange(postorder, 0, L));
                root.right = constructFromPrePost(Arrays.copyOfRange(preorder, L + 1, preorder.length), Arrays.copyOfRange(postorder, L, postorder.length));
                break;
            }
        }
        return root;
    }
    */

}
