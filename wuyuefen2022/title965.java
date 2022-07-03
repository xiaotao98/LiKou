package com.LiKou.simple.wuyuefen2022;

/**
 * 单值二叉树
 *
 * 思路： 先序遍历二叉树 判断每个节点值是否和根节点值相同
 */
public class title965 {

    /*public boolean isUnivalTree(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return true;
        }
        int index=root.val;
        while(root!=null||!stack.isEmpty()){
            if(root!=null){
                if(root.val!=index){
                    return false;
                }
                if(root.right!=null){
                    stack.push(root.right);
                }
                root=root.left;
            }else{
                root=stack.pop();
            }
        }
        return true;
    }*/

}
