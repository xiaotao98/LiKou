package com.LiKou.simple.wuyuefen2022;

/**
 * 二叉搜索树的范围和
 * <p>
 * 思想：遍历每一个节点  然后符合要求的都加起来   遍历方法随意
 */
public class title938 {

    /**
     * 中序遍历  然后符合要求的都加起来
     */
    /*public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.val >= low && root.val <= high) {
                    sum = sum + root.val;
                }
                root = root.right;
            }
        }
        return sum;
    }*/

    /**
     * 深度遍历的做法
     */
   /* class Solution {
        int sum=0;
        public int rangeSumBST(TreeNode root, int low, int high) {
            dfs(root,low,high);
            return sum;
        }

        public void dfs(TreeNode root,int low, int high){
            if(root!=null){
                if(root.val>=low&&root.val<=high){
                    sum=sum+root.val;
                }
                dfs(root.left,low,high); //遍历左边
                dfs(root.right,low,high);//遍历右边
            }
        }
    }*/
}
