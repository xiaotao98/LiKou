package com.LiKou.simple.sansiyuefen2022;

/**
将一个升序的数组，构造成一个二叉搜索树
 思路：每次将数组中最中间的那个值作为根的值  即可
 */
public class title108 {
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

        public TreeNode sortedArrayToBST(int[] nums) {

            TreeNode  root= gouzao(nums,0,nums.length-1);
            return root;

        }

        private TreeNode gouzao(int[] nums, int left, int right) {
            if (left>right){
                return null;
            }

            int mid=(left+right)/2;
            TreeNode root=new TreeNode(nums[mid]);

            root.left = gouzao(nums, left, mid - 1);
            root.right = gouzao(nums, mid+1, right);
            return root;

        }


    }


}








