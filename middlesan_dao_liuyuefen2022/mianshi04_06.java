package com.LiKou.middle.middlesan_dao_liuyuefen2022;

public class mianshi04_06 {
    public static void main(String[] args) {

    }

    /**
     * 首先  用中序遍历二叉树的模板  然后  用一个标记flag  标记当前已经遍历到节点p
     * 然后把中序遍历的下一个节点返回  即可
     */
    /*public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        boolean flag = false;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root == p) {//标记当前遍历到节点p
                    flag = true;
                }
                if (flag && root != p) { //将下一个节点返回
                    return root;
                }
                root = root.right;
            }
        }
        return null;
    }*/


}
