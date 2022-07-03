package com.LiKou.middle.middlesan_dao_liuyuefen2022;

/**
 * 把二叉搜索树转换为累加树
 * <p>
 * 思路：中序遍历就是从小到大，但是他需要将每个节点以及比自己大的数加起来，那么改变一下中序遍历，从右跟左遍历二叉树
 * 然后用一个num累加遍历过的节点和，将num赋值给每一个节点  即可
 */
public class title538 {

    /**
     * 非递归  改动中序遍历
     */
    /*
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                num = num + node.val;
                node.val = num;
                node = node.left;
            }
        }
        return root;
    }*/

    /**
     * 递归  中序遍历改动版
     */
   /*
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);//遍历右子树
            num = num + root.val;
            root.val = num;//遍历根
            convertBST(root.left);//遍历左子树
            return root;
        }
        return null;
    }
    */

}
