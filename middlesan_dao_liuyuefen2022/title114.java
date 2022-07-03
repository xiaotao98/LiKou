package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 二叉树展开为链表
 * <p>
 * 思路：先序遍历得到所有节点，然后将节点连接起来，左设为空
 */
public class title114 {

  /*
   public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();//list必须存TreeNode才行
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                list.add(root);
                if (root.right != null) {
                    stack.push(root.right);
                }
                root = root.left;
            } else {
                root = stack.pop();
            }
        }
        for (int i = 1; i < list.size(); i++) {
            TreeNode node = list.get(i);
            root = list.get(i - 1);
            root.right = node;
            root.left = null;
            root = root.right;
        }
    }
    */

}
