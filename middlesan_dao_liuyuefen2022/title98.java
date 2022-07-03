package com.LiKou.middle.middlesan_dao_liuyuefen2022;



/**
 * 验证二叉搜索树
 * <p>
 * 思路：中序遍历这颗二叉树，然后看他结果是否递增
 */
public class title98 {

   /*
   public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        Integer num = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    */
}
