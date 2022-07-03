package com.LiKou.simple.liuyuefen2022;

/**
 * 二叉树的直径
 *
 * 思路1：先序遍历二叉树，然后计算每个节点的左右子树高度之和，取其中的最大值
 *
 * 思路2：直接计算每个节点的左右子树高度之和，取其中的最大值
 */
public class title543 {

  /*
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        gaodu(root);
        return max;
    }
    public int gaodu(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=gaodu(node.left);
        int r=gaodu(node.right);
        if(l+r>max){
            max=l+r;
        }
        return Math.max(l,r)+1;//返回子树最大深度
    }
    */

    /**
     * 思路1
     */
    /*
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                int l = gaodu(root.left);
                int r = gaodu(root.right);
                if (l + r > max) {
                    max = l + r;
                }
                if (root.right != null) {
                    stack.push(root.right);
                }
                root = root.left;
            } else {
                root = stack.pop();
            }
        }
        return max;
    }

    //计算这个节点为根的高度
    public int gaodu(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(gaodu(node.left), gaodu(node.right)) + 1;
    }
    */

}
