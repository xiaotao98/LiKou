package com.LiKou.simple.wuyuefen2022;

/**
 * 二叉搜索树中的搜索
 */
public class title700 {
    /**
     * 针对的是普通二叉树
     */
    /*
        public TreeNode searchBST(TreeNode root, int val) {
        if(root==null||root.val==val) return root;
        TreeNode left=searchBST( root.left,  val);
        TreeNode right=searchBST( root.right,  val);
        return left!=null?left:right;
    }*/
/**
 * 针对的是二叉搜索树
 */
/*    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null||root.val==val) return root;
        if(root.val<val){
            return searchBST( root.right,  val);
        }
        if(root.val>val){
            return searchBST( root.left,  val);
        }
        return null;
    }*/

}
