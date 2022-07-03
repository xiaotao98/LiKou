package com.LiKou.simple.wuyuefen2022;

/**
 * 二叉搜索树节点最小距离
 *
 * 首先中序遍历二叉树  得到一个升序的序列   然后相邻的数两两比较差值   取最小的那一个
 */
public class title783 {

    /*public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
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
        for (int i = 1; i < list.size(); i++) {
            int rst = list.get(i) - list.get(i - 1);
            if (rst < min) {
                min = rst;
            }
        }
        return min;
    }*/

}
