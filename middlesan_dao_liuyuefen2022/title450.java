package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 删除二叉搜索树中的节点
 * <p>
 * 思路：若删除的节点是在左子树中，修改左子树，然后返回root
 * 若删除的节点是在右子树中，修改右子树，然后返回root
 * 若删除的节点根节点，则需要找到右子树最小节点，存在，把左子树放到右子树最小节点的左边。不存在，直接返回根的左子树
 */
public class title450 {
    /*public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {//说明待删除节点在左子树
            TreeNode left = deleteNode(root.left, key);
            root.left = left;//调整左子树
        } else if (key > root.val) {//说明待删除节点在右子树
            TreeNode right = deleteNode(root.right, key);
            root.right = right;//调整右子树
        } else {//说明待删除节点为根节点,把左子树调整到右子树中，返回右
            TreeNode left = root.left;
            TreeNode right = root.right;
            //找右子树中最小的点
            while (right != null && right.left != null) {
                right = right.left;
            }
            if (right == null) {//说明整棵树的右子树是空，返回左子树即可
                return root.left;
            } else {//右子树不为空，把左子树放到右子树最小节点的左边
                right.left = left;
                return root.right;//此处不能返回right，因为right变了
            }
        }
        return root;
    }*/
}
