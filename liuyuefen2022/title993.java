package com.LiKou.simple.liuyuefen2022;

/**
 * 二叉树的堂兄弟节点
 * <p>
 * 思路：深度遍历二叉树  找到两个点的根节点以及她们的深度   然后进行判断
 */
public class title993 {

    /*
    TreeNode p1 = null;
    TreeNode p2 = null;
    int h1 = 0;
    int h2 = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return p1 != p2 && h1 == h2;
    }

    public void dfs(TreeNode root, TreeNode parent, int x, int y, int high) {
        if (root != null) {
            high++;
            if (root.var == x) {
                p1 = parent;
                h1 = high;
            }
            if (root.var == y) {
                p2 = parent;
                h2 = high;
            }
            dfs(root.left, root, x, y, high);
            dfs(root.right, root, x, y, high);
        }
    }
    */

}
