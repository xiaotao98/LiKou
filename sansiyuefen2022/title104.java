package com.LiKou.simple.sansiyuefen2022;

/**
 * 求一棵二叉树的最大深度
 * 思路：递归   左子树得到a  遍历右子树得到b
 * 返回a和b中较大的一个
 */
public class title104 {
    public static void main(String[] args) {
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int maxDepth(TreeNode root) {


            if (root == null) {
                return 0;
            }

            int left = maxDepth(root.left);//运行的方法的次数不就是深度
            int right = maxDepth(root.right);

            return Integer.max(left, right)+1;


        }




    }


}








