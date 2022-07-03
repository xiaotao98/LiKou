package com.LiKou.simple.wuyuefen2022;

/**
 * 从根到叶的二进制数之和
 * <p>
 * 思路：深度遍历二叉树，将根节点到叶子节点的所有值存到string中，若他是叶子节点，然后将其加入到list中
 */
public class title1022 {

    /*List<String> list = new ArrayList<>();

    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        String path = "";
        dfs(root, path);
        for (int i = 0; i < list.size(); i++) {
            sum = sum + Integer.parseInt(list.get(i), 2);
        }
        return sum;
    }

    public void dfs(TreeNode root, String path) {
        if (root == null) {
            return;
        }
        path = path + String.valueOf(root.val);
        if (root.right == null && root.left == null) {//是叶子节点了
            list.add(path);
        } else {
            dfs(root.left, path);
            dfs(root.right, path);
        }
    }*/
}
