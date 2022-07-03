package com.LiKou.simple.sansiyuefen2022;

import java.util.*;

//二叉树的前  中    后序遍历
public class title94 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        System.out.println(list1);


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
     * 二叉树的中序遍历   左根右
     * 如果根不为空  根入栈   遍历根的左节点
     * 根为空  根=栈顶值   把栈顶值入list  遍历根的右节点
     *
     * @param root
     * @return
     */

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
//        LinkedList<Integer> list = new LinkedList();
        List<Integer> list = new LinkedList();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

    /**
     * 中序遍历递归版
     */
/*
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
    */

    /**
     * 二叉树的先序遍历    根 左 右
     * 根不为空  根入list  如果右不为空  右入栈    遍历根的左节点
     * 根为空  root=栈顶值
     *
     * @param root
     * @return
     */

    public List<Integer> preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        LinkedList<Integer> list = new LinkedList();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                list.add(root.val);
                if (root.right != null) {
                    stack.push(root.right);
                }
                root = root.left;
            } else {
                root = stack.pop();
            }
        }
        return list;
    }

    /**
     * 先序遍历递归版
     */
/*
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }*/

    /**
     * 后序遍历
     * 这里用了头插法，所以看成 根 右 左
     * 根不空   根直接头插入list
     * 左在最后，左不为空，左先入栈；
     * <p>
     * 还有一个方法   就是套用先序遍历   把先序遍历变为  根右左   遍历完之后将list倒过来
     *
     * @param root
     * @return
     */

    public List postorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        LinkedList list = new LinkedList();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                //头插法
                list.addFirst(root.val);
                if (root.left != null)
                    stack.push(root.left);
                //优先访问右子树
                root = root.right;
            } else {
                root = stack.pop();
            }
        }
        return list;
    }

    /**
     * 后序遍历递归版
     */
/*
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }*/


    /**
     * 二叉树深度遍历
     * <p>
     * 递归
     */
    public void dfs(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        dfs(list, root.left);
        dfs(list, root.right);
    }

    /**
     * 层序遍历
     * <p>
     * 利用队，根不为空，将跟入队，然后取出队列中所有元素，并将取出的这些元素的孩子节点入队，直到队为空
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return list1;
        queue.add(root);//根节点入队
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list2 = new ArrayList<>();
            while (size > 0) {//把原先队列中的所有节点都取出来存到一个列表
                TreeNode poll = queue.poll();
                list2.add(poll.val);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                size--;
            }
            list1.add(list2);
        }
        return list1;
    }


}
