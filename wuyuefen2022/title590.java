package com.LiKou.simple.wuyuefen2022;

/**
 * N 叉树的后序遍历
 *
 * 思路：把先序的根左右改为根右左  最后翻转一下集合  即可
 */
public class title590 {

    /*public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            for (int i = 0; i < node.children.size(); i++) {
                stack.push(node.children.get(i));
            }
        }
        Collections.reverse(list);
        return list;
    }*/
}
