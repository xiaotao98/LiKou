package com.LiKou.simple.wuyuefen2022;

/**
 * N叉树的前序遍历
 * 思路：根入栈   只要栈不为空，出栈，并且把栈顶值加入list  然后将该节点的孩子从右往左依次入栈
 */
public class title589 {


    /*public List<Integer> preorder(Node root) {
        Stack<Node> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            list.add(node.val);
            for(int i=node.children.size()-1;i>=0;i--){//该节点的孩子从右往左依次入栈
                stack.push(node.children.get(i));
            }
        }
        return list;
    }*/
}
