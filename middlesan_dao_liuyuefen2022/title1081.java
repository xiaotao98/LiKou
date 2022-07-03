package com.LiKou.middle.middlesan_dao_liuyuefen2022;

import java.util.Stack;

/**
 * 不同字符的最小子序列
 * <p>
 * 思路：利用栈。遍历字符串，当前字符在栈中有，直接终止本次循环。如果栈中没有，那么需要判断当前这个字符是否比栈顶大
 * 大的话  直接入栈  小的话，需要判断后续字符串中是否还有栈顶值，有的话，出栈，一直while。  最后再把本次的数值入栈
 * 最后的结果就是出栈值，然后把他逆过来
 */
public class title1081 {

    public String smallestSubsequence(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.contains(s.charAt(i))) {//栈中包含直接跳过
                continue;
            }
            while (!stack.isEmpty() && s.charAt(i) < stack.peek() && s.substring(i + 1).contains(stack.peek() + "")) {//当前字符比栈顶小,并且栈顶值在后面还有，那么出栈
                stack.pop();
            }
            stack.push(s.charAt(i));//栈中没有的无论如何也要进栈
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
