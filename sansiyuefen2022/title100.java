package com.LiKou.simple.sansiyuefen2022;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//判断两棵树是否相等
public class title100 {
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
    }


    /**
     * 判断两棵树是否相等
     * 自己的思路是一个一个遍历节点再比较  超时
     * 要想到用递归
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null&&q==null){
            return true;
        }
        if ((p==null&&q!=null)||(p!=null&&q==null)){
            return false;
        }
        if (p.val!= q.val){
            return false;
        }
        while (p!=null&&q!=null){
           return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;
    }


    /**
     * 比较两棵树是否相等  自己的思路   不过显示超时
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree1(TreeNode p, TreeNode q) {

            if ((p==null&&q!=null)||(p!=null&&q==null)){
                return false;
            }

            while (p!=null&&q!=null){
                if (p.val!= q.val){
                    return false;
                }
                while (p.left!=null&&q.left!=null){
                    p=p.left;
                    q=q.left;
                    if (p.val!= q.val){
                        return false;
                    }
                }
                while (p.right!=null&&q.right!=null){
                    p=p.right;
                    q=q.right;
                    if (p.val!= q.val){
                        return false;
                    }
                }
            }
            return true;

    }







}
