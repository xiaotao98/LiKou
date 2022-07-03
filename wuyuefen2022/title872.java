package com.LiKou.simple.wuyuefen2022;

/**
 * 叶子相似的树
 * <p>
 * 思路1：先序遍历二叉树，将其中的叶子节点放入到list中，然后比较两个list是否相等
 * <p>
 * 思路2：深度遍历，将其中的叶子节点放入到list中，然后比较两个list是否相等
 */
public class title872 {
    /**
     * 思路1
     */
    /*public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (root1 != null || !stack1.isEmpty()) {
            if (root1 != null) {
                if (root1.left == null && root1.right == null) {
                    list1.add(root1.val);//只添加叶子节点
                }
                if (root1.right != null) {
                    stack1.push(root1.right);
                }
                root1 = root1.left;
            } else {
                root1 = stack1.pop();
            }
        }

        while (root2 != null || !stack2.isEmpty()) {
            if (root2 != null) {
                if (root2.left == null && root2.right == null) {
                    list2.add(root2.val);//只添加叶子节点
                }
                if (root2.right != null) {
                    stack2.push(root2.right);
                }
                root2 = root2.left;
            } else {
                root2 = stack2.pop();
            }
        }
        return list1.equals(list2);
    }*/

    /**
     * 思路2
     */
    /*public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1, list1);
        dfs(root2, list2);
        return list1.equals(list2);
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);//叶子节点值加入list中
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }*/
}
