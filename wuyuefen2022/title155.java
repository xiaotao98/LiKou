package com.LiKou.simple.wuyuefen2022;

/**
 * 最小栈
 * <p>
 * 思路：利用一个新的栈，每次往栈里面添加两个元素，一个是当前元素，一个是目前元素中的最小元素
 * 这样的话 栈顶元素永远是最小元素，栈顶元素下一个元素就是原有的栈顶元素，删除元素，pop两次即可
 */
public class title155 {

    /*Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            stack.push(val);
        } else {
            int temp = stack.peek();
            stack.push(val);
            if (temp < val) {
                stack.push(temp);
            } else {
                stack.push(val);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return stack.get(stack.size() - 2);
    }

    public int getMin() {
        return stack.peek();
    }*/

}
