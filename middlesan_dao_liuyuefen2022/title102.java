package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 二叉树的层序遍历
 * <p>
 * 思路  利用队列
 */
public class title102 {
    public static void main(String[] args) {

    }

    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return list1;
        }
        queue.add(root);//根节点入队
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list2 = new ArrayList<>();
            while (size > 0) {//把原先队列中的所有节点都取出来存到一个列表
                TreeNode treeNode = queue.poll();
                list2.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
                size--;
            }
            list1.add(list2);
        }
        return list1;
    }*/
}
