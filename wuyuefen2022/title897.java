package com.LiKou.simple.wuyuefen2022;

/**
 * 递增顺序搜索树
 * <p>
 * 思路:中序遍历二叉树，将遍历的值传入到新的节点  然后连起来
 */
public class title897 {
    /*
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = new TreeNode(0);
        TreeNode cur = head;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                TreeNode node = new TreeNode(root.val);
                cur.right = node;
                cur = cur.right;
                root = root.right;
            }
        }
        return head.right;
    }
    */
}
