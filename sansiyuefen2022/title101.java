package com.LiKou.simple.sansiyuefen2022;

/**
 * 判断一棵二叉树是否是对称二叉树
 * 思路：
 * 如果root为空  那么返回true
 * 不然的话写个方法  递归比较左子树和右子树
 * 两个都为空 true   一个为空  false   两个值不相同  false
 * return   左子树的左节点和右子树的右节点 && 左子树的右节点和右子树的左节点
 */
public class title101 {
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



        public boolean isSymmetric(TreeNode root) {

            if(root==null){
                return true;
            }

            return cmp(root.left,root.right);
        }

        public boolean cmp(TreeNode node1,TreeNode node2){
            if(node1==null&&node2==null){
                return true;
            }
            if(node1==null||node2==null){
                return false;
            }
            if(node1.val!=node2.val){
                return false;
            }

            return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
        }

    }






    }








