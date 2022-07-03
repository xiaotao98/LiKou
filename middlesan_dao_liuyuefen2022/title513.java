package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 找树左下角的值
 * <p>
 * 思路：1：DFS+记录深度   由于dfs遍历时会最先遍历左边，只要判断遍历到的节点是否是叶子节点，以及深度是否时最大  即可
 * <p>
 * 思路：2：BFS稍作改动  bfs从左往右，将他改为从右往左   那样  遍历到的最后一个节点就是需要找的节点      非常秒
 */
public class title513 {

/**
 * 思路：1
 */
/*
    int rst = 0;
    int max = -1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return rst;
    }

    public void dfs(TreeNode root, int depth) {//深度遍历+记录深度
        if (root != null) {
            if (root.left == null && root.right == null) {
                if (max < depth) {
                    max = depth;
                    rst = root.val;
                }
            }
            dfs(root.left, depth + 1);
            dfs(root.right, depth + 1);
        }
    }
    */

    /**
     * 思路：2
     */
/*
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null) {//这是是关键  正常的BFS要 先左 后右
                queue.add(root.right);
            }
            if (root.left != null) {
                queue.add(root.left);
            }
        }
        return root.val;
    }
    */


}
